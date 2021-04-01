package com.epam.test.automation.java.practice4;

public class Task2 {

   
    public static int[] transform(int[] array, SortOrder order) {
        if (IsSorted(array, order))
            {
                for (int i = 0; i < array.Length; i++)
                {
                    array[i] += i;
                }
            }
    }
}
