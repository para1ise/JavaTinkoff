package edu.hw3;

import java.util.HashMap;

public class Task1 {
    private HashMap alphabet;

    public Task1() {
        alphabet = new HashMap<>();
        char shift = 'b' - 'a';
        for (char i = shift; i <= 'z' - 'a'; ++i) {
            char letter = (char) ('a' + (i - shift));
            Character key = letter;
            letter = (char) ('z' + shift - i);
            Character value = letter;
            alphabet.put(key, value);
        }
        for (char i = shift; i <= 'Z' - 'A'; ++i) {
            char letter = (char) ('A' + (i - shift));
            Character key = letter;
            letter = (char) ('Z' + shift - i);
            Character value = letter;
            alphabet.put(key, value);
        }
    }

    public String atbash(String string) {
        int length = string.length();
        StringBuilder newString = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            if (alphabet.containsKey(string.charAt(i))) {
                newString.append(alphabet.get(string.charAt(i)));
            } else {
                newString.append(string.charAt(i));
            }
        }
        return newString.toString();
    }
}
