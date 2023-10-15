package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task5.isPalindromeDescendant;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @Test
    @DisplayName("Проверка корректных данных1")
    void filterCorrectData1() {
        assertThat(isPalindromeDescendant(11211230)).isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка корректных данных2")
    void filterCorrectData2() {
        assertThat(isPalindromeDescendant(13001120)).isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка корректных данных3")
    void filterCorrectData3() {
        assertThat(isPalindromeDescendant(23336014)).isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка корректных данных4")
    void filterCorrectData4() {
        assertThat(isPalindromeDescendant(1234)).isEqualTo(false);
    }
}
