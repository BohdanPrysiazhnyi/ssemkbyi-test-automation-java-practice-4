package com.epam.test.automation.java.practice4;

public class Task3 {

    public static int multiArithmeticElements(int a1, int t, int n) {
          int result = a1;
        int currentNumber = a1;
        if (n == 0 || n < 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 1; i < n; i++) {
                currentNumber += t;
                result *= currentNumber;
            }

          return result;
        }
    }
}
