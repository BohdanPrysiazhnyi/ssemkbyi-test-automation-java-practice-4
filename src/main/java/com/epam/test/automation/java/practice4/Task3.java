package com.epam.test.automation.java.practice4;

public class Task3 {

    public static int multiArithmeticElements(int a1, int t, int n) {
          int result = 0;
          int currentNumber = a1;
          if (n == 0 || n < 0 ) {throw new IllegalArgumentException();}
          else {
             for (int i = 0; i < n; i++) {
                  currentNumber *=t;
                  result = a1 + currentNumber;
          }
          return result;
    }
}
