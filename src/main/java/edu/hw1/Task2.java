package edu.hw1;

public class Task2 {
    private Task2() {
    }

    public static int countDigits(int number) {
        final int TEN = 10;
        int temporaryVariableOfNumber = number;
        int result = 0;
        if (temporaryVariableOfNumber != 0) {
            if (temporaryVariableOfNumber < 0) {
                temporaryVariableOfNumber *= -1;
            }
            while (temporaryVariableOfNumber > 0) {
                temporaryVariableOfNumber /= TEN;
                ++result;
            }
        } else {
            ++result;
        }
        return result;
    }
}
