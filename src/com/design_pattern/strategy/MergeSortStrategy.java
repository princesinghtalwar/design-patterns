package com.design_pattern.strategy;

import java.util.Arrays;

public class MergeSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting Using Merge Sort");
        Arrays.sort(arr);
    }
}
