package com.epam.test.automation.java.practice4;

public class Task2 {


    public static int[] transform(int[] array, SortOrder order) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException();
        } else if (Task1.isSorted(array, order)) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] + i;
            }
        }
        return array;

    }
}
