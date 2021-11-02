package com.epam.test.automation.java.practice4;

public class Task3 {

    public static int multiArithmeticElements(int a1, int t, int n) {

        int result = a1;
        int swap = a1;
        if (n < 0 || n == 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 1; i < n; i++) {
                swap += t;
                result *= swap;
            }
        }
        return result;

    }
}
