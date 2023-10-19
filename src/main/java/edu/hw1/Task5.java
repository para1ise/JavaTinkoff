package edu.hw1;

import static edu.hw1.Task2.countDigits;

public class Task5 {
    private Task5() {
    }

    public static boolean isPalindromeDescendant(int number) {
        int count = countDigits(number);
        if (number < 0 || count < 2) {
            return false;
        }
        boolean flag;
        if (isPalindrome(number)) {
            flag = true;
        } else if (count % 2 == 1) {
            flag = false;
        } else {
            String string = String.valueOf(number);
            StringBuilder newString = new StringBuilder(count / 2);
            for (int i = 1; i < count; i += 2) {
                newString.append(Integer.parseInt(String.valueOf(string.charAt(i - 1)))
                    + Integer.parseInt(String.valueOf(string.charAt(i))));
            }
            flag = isPalindromeDescendant(Integer.parseInt(newString.toString()));
        }
        return flag;
    }

    private static boolean isPalindrome(int number) {
        int flag = 1;
        String string = String.valueOf(number);
        int count = countDigits(number);
        for (int i = 0; i < count / 2; ++i) {
            if (string.charAt(i) != string.charAt(count - 1 - i)) {
                flag = 0;
                break;
            }
        }
        return flag == 1;
    }
}
