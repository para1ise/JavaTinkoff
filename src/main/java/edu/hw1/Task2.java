package edu.hw1;

import static java.lang.Math.abs;

public class Task2 {
    private Task2() {
    }

    @SuppressWarnings("MagicNumber")
    public static int countDigits(int number) {
        int tmp = number;
        int count = 0;
        if (tmp != 0) {
            if (tmp < 0) {
                tmp = abs(tmp);
            }
            while (tmp > 0) {
                tmp /= 10;
                ++count;
            }
        } else {
            ++count;
        }
        return count;
    }
}
