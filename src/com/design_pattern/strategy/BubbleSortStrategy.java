package com.design_pattern.strategy;

import java.util.Arrays;

//CONCRETE STRATEGY
public class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting Using Bubble Sort");
        Arrays.sort(arr);
    }
}
