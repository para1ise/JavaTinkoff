package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {
    @Test
    @DisplayName("Test correct data1")
    void filterData1() {
        HashMap<String, Integer> test = new HashMap<>();
        test.put("bb", 2);
        test.put("a", 2);
        assertThat(Task3.freqDict(new ArrayList<>(Arrays.asList("a", "bb", "a", "bb")))).isEqualTo(test);
    }

    @Test
    @DisplayName("Test correct data2")
    void filterData2() {
        HashMap<String, Integer> test = new HashMap<>();
        test.put("that", 1);
        test.put("and", 2);
        test.put("this", 1);
        assertThat(Task3.freqDict(new ArrayList<>(Arrays.asList("this", "and", "that", "and")))).isEqualTo(test);
    }

    @Test
    @DisplayName("Test correct data3")
    void filterData3() {
        HashMap<Object, Integer> test = new HashMap<>();
        test.put(1, 2);
        test.put(2, 2);
        assertThat(Task3.freqDict(new ArrayList<>(Arrays.asList(1, 1, 2, 2)))).isEqualTo(test);
    }
}
