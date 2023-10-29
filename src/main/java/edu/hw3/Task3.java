package edu.hw3;

import java.util.HashMap;
import java.util.List;

public class Task3 {
    private Task3() {
    }

    public static HashMap<Object, Integer> freqDict(List<Object> list) {
        HashMap<Object, Integer> result = new HashMap<>();
        for (var i : list) {
            if (result.containsKey(i)) {
                result.put(i, result.get(i) + 1);
            } else {
                result.put(i, 1);
            }
        }
        return result;
    }
}
