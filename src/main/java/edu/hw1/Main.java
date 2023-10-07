package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public final class Main {
    private final static Logger LOGGER = LogManager.getLogger();

    private Main() {
    }

    public static int minutesToSeconds(String str) {
        int val = str.indexOf(':');
        int ans = -1;
        final int SECONDS = 60;
        if (val != -1) {
            String[] time = str.split(":");
            int minute = Integer.parseInt(time[0]);
            int second = Integer.parseInt(time[1]);

            if (minute >= 0 && second >= 0 && second < SECONDS) {
                ans = minute * SECONDS + second;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        LOGGER.info("Привет, мир!");

    }
}
