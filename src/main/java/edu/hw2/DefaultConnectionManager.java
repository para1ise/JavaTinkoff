package edu.hw2;

public class DefaultConnectionManager implements ConnectionManager {
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
