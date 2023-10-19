package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task3.isNestable;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {
    @Test
    @DisplayName("Проверка корректных данных1")
    void filterCorrectData1() {
        assertThat(isNestable(new int[] {1, 2, 3, 4}, new int[] {0, 6})).isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка корректных данных2")
    void filterCorrectData2() {
        assertThat(isNestable(new int[] {3, 1}, new int[] {4, 0})).isEqualTo(true);

    }

    @Test
    @DisplayName("Проверка корректных данных3")
    void filterCorrectData3() {
        assertThat(isNestable(new int[] {9, 9, 8}, new int[] {8, 9})).isEqualTo(false);
    }

    @Test
    @DisplayName("Проверка корректных данных4")
    void filterCorrectData4() {
        assertThat(isNestable(new int[] {1, 2, 3, 4}, new int[] {2, 3})).isEqualTo(false);
    }
}
