package com.epam.test.automation.java.practice4;

public class Task4 {


    public static double sumGeometricElements(int a1, double t, int alim) {
        double result = 0;
        double currentValue = a1;

        if (a1 < alim || t <= 0 ) {
            throw new IllegalArgumentException();
        } else if (t==1){
            result = a1;
        } else {
            while (currentValue >= alim) {
                result += currentValue;
                currentValue *= t;
            }
        }
        return result;
    }
}
