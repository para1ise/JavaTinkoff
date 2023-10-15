package edu.hw1;

public class Task1 {
    private Task1() {
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
}
