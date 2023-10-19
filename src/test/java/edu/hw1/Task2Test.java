package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task2.countDigits;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    @DisplayName("Проверка корректных данных1")
    void filterCorrectData1() {
        assertThat(countDigits(-12)).isEqualTo(2);
    }

    @Test
    @DisplayName("Проверка корректных данных2")
    void filterCorrectData2() {
        assertThat(countDigits(0)).isEqualTo(1);
    }

    @Test
    @DisplayName("Проверка корректных данных3")
    void filterCorrectData3() {
        assertThat(countDigits(144)).isEqualTo(3);
    }
}
