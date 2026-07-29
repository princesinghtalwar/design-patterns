package com.design_pattern.strategy;

import java.util.Arrays;

//CONCRETE STRATEGY
public class QuickSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting Using Quick Sort");
        Arrays.sort(arr);
    }
}
