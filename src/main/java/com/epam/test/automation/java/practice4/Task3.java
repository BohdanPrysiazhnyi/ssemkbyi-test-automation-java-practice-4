package com.epam.test.automation.java.practice4;

public class Task3 {

    public static int multiArithmeticElements(int a1, int t, int n) {
          int result = 0;
          if (n == 0 || n < 0 ) {throw new IllegalArgumentException();}
          else {
              int n1 = n -1;
              int t1 = t*n1;
              result = a1 + t1;
          }
          return result;
    }
}
