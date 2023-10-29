package edu.hw2;

import static edu.hw2.Task3.LOGGER;

public class StableConnection implements Connection {
    @Override
    public void execute(String command) {
        LOGGER.info(State.CONNECTION_SUCCESS.getTitle());
    }

    @Override
    public void close() {
        LOGGER.info(State.CONNECTION_CLOSED.getTitle());
    }
}
