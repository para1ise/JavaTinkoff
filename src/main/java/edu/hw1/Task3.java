package edu.hw1;

public class Task3 {
    private Task3() {
    }

    public static boolean isNestable(int[] array1, int[] array2) {
        return minimumOfArray(array1) > minimumOfArray(array2) && maximumOfArray(array1) < maximumOfArray(array2);
    }

    private static int minimumOfArray(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    private static int maximumOfArray(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }
}
