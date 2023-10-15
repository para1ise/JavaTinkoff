package edu.hw1;

import java.util.Arrays;
import static edu.hw1.Task2.countDigits;

public class Task6 {
    private final static int KAPREKAR = 6174;

    private Task6() {
    }

    @SuppressWarnings("MagicNumber")
    public static int countK(int number) {
        if (number > 9999 || number < 1000 || isEqualsDigits(number)) {
            return -1;
        }
        if (number == KAPREKAR) {
            return 0;
        } else {
            int increaseDigitsNum = increaseDigits(number);
            int decreaseDigitsNum = decreaseDigits(number);
            int newNumber = decreaseDigitsNum - increaseDigitsNum;
            return 1 + countK(newNumber);
        }
    }

    @SuppressWarnings("MagicNumber")
    private static boolean isEqualsDigits(int n) {
        int flag = 1;
        int tmp = n;
        int tmpr = n % 10;
        while (tmp > 0) {
            if (tmp % 10 != tmpr) {
                flag = 0;
                break;
            }
            tmp /= 10;
        }
        return flag == 1;
    }

    @SuppressWarnings("MagicNumber")
    private static int increaseDigits(int n) {
        int count = countDigits(n);
        int[] arr = new int[count];
        int tmp = n;
        int res = 0;
        for (int i = 0; i < count; ++i) {
            arr[i] = tmp % 10;
            tmp /= 10;
        }
        Arrays.sort(arr);
        for (int i = 0; i < count; ++i) {
            res = res * 10 + arr[i];
        }
        return res;
    }

    @SuppressWarnings("MagicNumber")
    private static int decreaseDigits(int n) {
        int count = countDigits(n);
        int[] arr = new int[count];
        int tmp = n;
        int res = 0;
        for (int i = 0; i < count; ++i) {
            arr[i] = tmp % 10;
            tmp /= 10;
        }
        Arrays.sort(arr);
        for (int i = count - 1; i >= 0; --i) {
            res = res * 10 + arr[i];
        }
        return res;
    }
}
