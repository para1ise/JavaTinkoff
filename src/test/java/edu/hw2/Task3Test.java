package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task3Test {
    @Test
    @DisplayName("Фильтрация корректных данных")
    void zeroAttempts() {
        PopularCommandExecutor bedolaga = new PopularCommandExecutor(new DefaultConnectionManager(), 0);
        bedolaga.updatePackages();
    }

}
