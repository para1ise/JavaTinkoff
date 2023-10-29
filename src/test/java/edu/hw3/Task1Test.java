package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("Test correct data1")
    void filterData1() {
        Task1 test = new Task1();
        assertThat(test.atbash("Я, hello, мир, manera крутит мир")).isEqualTo("Я, svool, мир, nzmviz крутит мир");
    }

    @Test
    @DisplayName("Test correct data2")
    void filterData2() {
        Task1 test = new Task1();
        assertThat(test.atbash("В дабл капе мои заны, а в другой держу свой BEAN")).isEqualTo(
            "В дабл капе мои заны, а в другой держу свой YVZM");
    }

    @Test
    @DisplayName("Test correct data3")
    void filterData3() {
        Task1 test = new Task1();
        assertThat(test.atbash("How do you feel holding the hand of the one you love? Interlinked.\n" +
            "- interlinked. 2049")).isEqualTo("Sld wl blf uvvo slowrmt gsv szmw lu gsv lmv blf olev? Rmgviormpvw.\n" +
            "- rmgviormpvw. 2049");
    }
}
