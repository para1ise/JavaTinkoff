package edu.hw2;

import static edu.hw2.Task3.LOGGER;

public class FaultyConnection implements Connection {
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
