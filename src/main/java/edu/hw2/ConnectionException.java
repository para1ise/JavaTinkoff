package edu.hw2;

import static edu.hw2.Task3.LOGGER;

public class ConnectionException extends RuntimeException {
    private final State info;

    public ConnectionException(State info) {
        this.info = info;
    }

    @Override
    public void printStackTrace() {
        LOGGER.info(info.getTitle());
    }
}
