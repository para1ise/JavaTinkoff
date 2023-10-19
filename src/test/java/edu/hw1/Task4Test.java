package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task4.fixString;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("Проверка корректных данных1")
    void filterCorrectData1() {
        assertThat(fixString("123456")).isEqualTo("214365");
    }

    @Test
    @DisplayName("Проверка корректных данных2")
    void filterCorrectData2() {
        assertThat(fixString("hTsii  s aimex dpus rtni.g")).isEqualTo("This is a mixed up string.");
    }

    @Test
    @DisplayName("Проверка корректных данных3")
    void filterCorrectData3() {
        assertThat(fixString("badce")).isEqualTo("abcde");
    }

    @Test
    @DisplayName("Проверка некорректных данных1")
    void filterIncorrectData1() {
        assertThat(fixString("")).isEqualTo("");
    }
}
