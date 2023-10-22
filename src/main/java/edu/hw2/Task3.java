package edu.hw2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task3 {
    public Task3() {
    }

    private final static Logger LOGGER = LogManager.getLogger();

    public interface Connection extends AutoCloseable {
        void execute(String command);
    }

    public interface ConnectionManager {
        Connection getConnection();
    }

    public static class StableConnection implements Connection {
        @Override
        public void execute(String command) {
            LOGGER.info(State.CONNECTION_SUCCESS.getTitle());
        }

        @Override
        public void close() {
            LOGGER.info(State.CONNECTION_CLOSED.getTitle());
        }
    }

    public static class FaultyConnection implements Connection {
        final double chanceToError = 0.5;

        @Override
        public void execute(String command) {
            if (Math.random() <= chanceToError) {
                LOGGER.info(State.EXECUTION_FAILED);
                throw new ConnectionException(State.CONNECTION_FAILED);
            } else {
                LOGGER.info(State.CONNECTION_SUCCESS.getTitle());
            }
        }

        @Override
        public void close() {
            LOGGER.info(State.CONNECTION_CLOSED.getTitle());
        }
    }

    public static class ConnectionException extends RuntimeException {
        private final State info;

        public ConnectionException(State info) {
            this.info = info;
        }

        @Override
        public void printStackTrace() {
            LOGGER.info(info.getTitle());
        }
    }

    public static class DefaultConnectionManager implements ConnectionManager {
        private final double failChance;

        @SuppressWarnings("MagicNumber")
        public DefaultConnectionManager() {
            this.failChance = 0.5;
        }

        @Override
        public Connection getConnection() {
            if (Math.random() < failChance) {
                return new FaultyConnection();
            } else {
                return new StableConnection();
            }
        }
    }

    public static class FaultyConnectionManager implements ConnectionManager {
        @Override
        public Connection getConnection() {
            return new FaultyConnection();
        }
    }

    public static final class PopularCommandExecutor {
        private final ConnectionManager manager;
        private final int maxAttempts;

        public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
            this.manager = manager;
            this.maxAttempts = maxAttempts;
        }

        public void updatePackages() {
            tryExecute("apt update && apt upgrade -y");
        }

        @SuppressWarnings("RegexpSinglelineJava")
        void tryExecute(String command) throws ConnectionException {
            int attemptsLeft = maxAttempts;
            while (attemptsLeft != 0) {
                LOGGER.info(State.ATTEMPTS_LEFT.getTitle().formatted(attemptsLeft));
                try (Connection connection = manager.getConnection()) {
                    connection.execute(command);
                    break;
                } catch (Exception excep) {
                    excep.printStackTrace();
                }
                attemptsLeft--;
            }
            if (attemptsLeft == 0) {
                throw new ConnectionException(State.NO_ATTEMPTS);
            }
        }
    }
}
