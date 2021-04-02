package com.epam.test.automation.java.practice4;

public class Task4 {

  
    public static double sumGeometricElements(int a1, double t, int alim) {
       double result = 0;
        double currentNum = a1;
        if (t == 0 || t <0 || alim < 0) {
            throw new IllegalArgumentException();
        } else {
           while (currentNum >= alim) {
               result += currentNum;
               currentNum *= t;
            }
        }
        return result;
    }
}
