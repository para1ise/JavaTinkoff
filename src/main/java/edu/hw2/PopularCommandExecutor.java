package edu.hw2;

import static edu.hw2.Task3.LOGGER;

public final class PopularCommandExecutor {
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
