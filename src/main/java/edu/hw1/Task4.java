package edu.hw1;

public class Task4 {
    private Task4() {
    }

    public static String fixString(String string) {
        int length = string.length();
        StringBuilder newString = new StringBuilder(length);
        for (int i = 1; i < length; i += 2) {
            newString.append(string.charAt(i));
            newString.append(string.charAt(i - 1));
        }
        if (length % 2 == 1) {
            newString.append(string.charAt(length - 1));
        }
        return newString.toString();
    }
}
