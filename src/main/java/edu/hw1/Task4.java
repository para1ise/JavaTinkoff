package edu.hw1;

public class Task4 {
    private Task4() {
    }

    public static String fixString(String str) {
        if (str == null) {
            return null;
        }
        int len = str.length();
        StringBuilder newStr = new StringBuilder(len);
        for (int i = 1; i < len; i += 2) {
            newStr.append(str.charAt(i));
            newStr.append(str.charAt(i - 1));
        }
        if (len % 2 == 1) {
            newStr.append(str.charAt(len - 1));
        }
        return newStr.toString();
    }
}
