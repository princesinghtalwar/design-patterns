package com.design_pattern.strategy;

//CONTEXT
public class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] arr){
        if(sortingStrategy!=null)
            sortingStrategy.sort(arr);
    }
}
