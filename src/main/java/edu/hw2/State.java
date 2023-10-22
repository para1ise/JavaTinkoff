package edu.hw2;

public enum State {
    CONNECTION_SUCCESS("CONNECTION_SUCCESS"),
    CONNECTION_CLOSED("CONNECTION_CLOSED"),
    CONNECTION_FAILED("CONNECTION_FAILED"),
    EXECUTION_FAILED("EXECUTION_FAILED"),
    ATTEMPTS_LEFT("ATTEMPTS_LEFT"),
    NO_ATTEMPTS("NO_ATTEMPTS");

    private final String title;

    State(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
