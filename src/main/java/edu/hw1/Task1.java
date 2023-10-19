package edu.hw1;

public class Task1 {
    private Task1() {
    }

    public static int minutesToSeconds(String str) {
        final int SECONDS_IN_MINUTE = 60;
        int result = -1;
        if (str.indexOf(':') != -1) {
            String[] time = str.split(":");
            int minutes = Integer.parseInt(time[0]);
            int seconds = Integer.parseInt(time[1]);

            if (minutes >= 0 && seconds >= 0 && seconds < SECONDS_IN_MINUTE) {
                result = minutes * SECONDS_IN_MINUTE + seconds;
            }
        }
        return result;
    }
}
