package com.epam.test.automation.java.practice4;

public class Task4 {


    public static double sumGeometricElements(int a1, double t, int alim) {
        double result = 0;
        double currentValue = a1;

        if (a1 < alim) {
            throw new IllegalArgumentException();
        } else {
            while (currentValue >= alim) {
                result += currentValue;
                currentValue *= t;
            }
        }
        return result;
    }
}
