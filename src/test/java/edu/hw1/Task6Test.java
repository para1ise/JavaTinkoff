package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task6.countK;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {
    @Test
    @DisplayName("Проверка корректных данных1")
    void filterCorrectData1() {
        assertThat(countK(6621)).isEqualTo(5);
    }

    @Test
    @DisplayName("Проверка корректных данных2")
    void filterCorrectData2() {
        assertThat(countK(6554)).isEqualTo(4);
    }

    @Test
    @DisplayName("Проверка корректных данных3")
    void filterCorrectData3() {
        assertThat(countK(1234)).isEqualTo(3);
    }

    @Test
    @DisplayName("Проверка некорректных данных1")
    void filterIncorrectData1() {
        assertThat(countK(-1)).isEqualTo(-1);
    }

    @Test
    @DisplayName("Проверка некорректных данных2")
    void filterIncorrectData2() {
        assertThat(countK(123)).isEqualTo(-1);
    }

    @Test
    @DisplayName("Проверка некорректных данных3")
    void filterIncorrectData3() {
        assertThat(countK(2222)).isEqualTo(-1);
    }
}
