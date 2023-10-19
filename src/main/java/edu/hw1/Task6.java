package edu.hw1;

import java.util.Arrays;
import static edu.hw1.Task2.countDigits;

public class Task6 {
    private static final int KAPREKAR = 6174;
    private static final int TEN = 10;

    private Task6() {
    }

    public static int countK(int number) {
        final int MAX_OF_FOUR_DIGIT_NUMBER = 9999;
        final int MIN_OF_FOUR_DIGIT_NUMBER = 1000;
        if (number > MAX_OF_FOUR_DIGIT_NUMBER || number < MIN_OF_FOUR_DIGIT_NUMBER || isEqualsDigitsInNumber(number)) {
            return -1;
        }
        if (number == KAPREKAR) {
            return 0;
        } else {
            int ascendingDigitsNum = sortByAscendingDigitsOfNumber(number);
            int descendingDigitsNum = sortByDescendingDigitsOfNumber(number);
            int newNumber = descendingDigitsNum - ascendingDigitsNum;
            return 1 + countK(newNumber);
        }
    }

    private static boolean isEqualsDigitsInNumber(int number) {
        boolean flag = true;
        int tmp = number;
        int tmp1 = number % TEN;
        while (tmp > 0) {
            if (tmp % TEN != tmp1) {
                flag = false;
                break;
            }
            tmp /= TEN;
        }
        return flag;
    }

    private static int sortByAscendingDigitsOfNumber(int number) {
        int count = countDigits(number);
        int[] arrayOfDigits = new int[count];
        int tmp = number;
        int result = 0;
        for (int i = 0; i < count; ++i) {
            arrayOfDigits[i] = tmp % TEN;
            tmp /= TEN;
        }
        Arrays.sort(arrayOfDigits);
        for (int i = 0; i < count; ++i) {
            result = result * TEN + arrayOfDigits[i];
        }
        return result;
    }

    private static int sortByDescendingDigitsOfNumber(int number) {
        int count = countDigits(number);
        int[] arrayOfDigits = new int[count];
        int tmp = number;
        int result = 0;
        for (int i = 0; i < count; ++i) {
            arrayOfDigits[i] = tmp % TEN;
            tmp /= TEN;
        }
        Arrays.sort(arrayOfDigits);
        for (int i = count - 1; i >= 0; --i) {
            result = result * TEN + arrayOfDigits[i];
        }
        return result;
    }
}
