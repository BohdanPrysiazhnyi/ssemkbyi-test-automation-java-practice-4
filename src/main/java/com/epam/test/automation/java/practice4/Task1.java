package com.epam.test.automation.java.practice4;

public class Task1 {

    
    public static boolean isSorted(int[] array, SortOrder order) {
        if (order == SortOrder.ASC)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    return false;
                }
            }
        }
        else if
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] < array[i + 1])
                {
                    return false;
                }
            }
        } else throw new IllegalArgumentException();
        
        return true;
    }
}
