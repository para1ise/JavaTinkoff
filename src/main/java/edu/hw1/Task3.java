package edu.hw1;

public class Task3 {
    private Task3() {
    }

    public static boolean isNestable(int[] arr1, int[] arr2) {
        return min(arr1) > min(arr2) && max(arr1) < max(arr2);
    }

    private static int min(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < res) {
                res = arr[i];
            }
        }
        return res;
    }

    private static int max(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > res) {
                res = arr[i];
            }
        }
        return res;
    }
}
