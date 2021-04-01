package com.epam.test.automation.java.practice4;

public class Task1 {

    
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || array.length ==0) throw new IllegalArgumentException();
        else if (order == SortOrder.Ascending) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
