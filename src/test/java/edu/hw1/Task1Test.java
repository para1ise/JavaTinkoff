package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Main.minutesToSeconds;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("Фильтрация корректных данных")
    void filterCorrectData() {
        assertThat(minutesToSeconds("14:45")).isEqualTo(14 * 60 + 45);
    }

    @Test
    @DisplayName("Фильтрация некорректных данных №1")
    void filterIncorrectData1() {
        assertThat(minutesToSeconds("12:90")).isEqualTo(-1);
    }

    @Test
    @DisplayName("Фильтрация некорректных данных №2")
    void filterIncorrectData2() {
        assertThat(minutesToSeconds("00:-1")).isEqualTo(-1);
    }

    @Test
    @DisplayName("Фильтрация некорректных данных №3")
    void filterIncorrectData3() {
        assertThat(minutesToSeconds("-50:40")).isEqualTo(-1);
    }

    @Test
    @DisplayName("Фильтрация некорректных данных №4")
    void filterIncorrectData4() {
        assertThat(minutesToSeconds("01:60")).isEqualTo(-1);
    }

}
