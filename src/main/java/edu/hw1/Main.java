package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static java.lang.Math.abs;

public final class Main {
    private final static Logger LOGGER = LogManager.getLogger();

    private Main() {
    }

    public static void main(String[] args) {
        LOGGER.info("Привет, мир!");
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
