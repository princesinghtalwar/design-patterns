package com.design_pattern.strategy;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int[] arr = {7,5,0,78,55};
        System.out.println(Arrays.toString(arr));
        SortingStrategy bubbleSortingStrategy = new BubbleSortStrategy();
        SortingContext bubbleSortingContext = new SortingContext(bubbleSortingStrategy);
        bubbleSortingContext.performSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("==============================");

        int[] arr1 = {56,33,67,1,68};
        System.out.println(Arrays.toString(arr1));
        SortingStrategy quickSortingStrategy = new QuickSortStrategy();
        SortingContext quickSortingContext = new SortingContext(quickSortingStrategy);
        quickSortingContext.performSort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("==============================");

        int[] arr2 = {5,6,22,75,3};
        System.out.println(Arrays.toString(arr2));
        SortingStrategy mergeSortingStrategy = new MergeSortStrategy();
        SortingContext mergeSortingContext = new SortingContext(mergeSortingStrategy);
        mergeSortingContext.performSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
