package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;

public class SelectionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            swap(unsortedArray, i, findMinimumElementIndex(unsortedArray, i));
        }

        return unsortedArray;
    }

    private <T extends Comparable<T>> int findMinimumElementIndex(T[] unsortedArray, int startIndex) {
        int minimumElementIndex = startIndex;

        for (int i = startIndex + 1; i < unsortedArray.length; i++) {
            if (unsortedArray[i].compareTo(unsortedArray[minimumElementIndex]) < 0) {
                minimumElementIndex = i;
            }
        }

        return minimumElementIndex;
    }

    private <T extends Comparable<T>> void swap(T[] unsortedArray, int firstIndex, int secondIndex) {
        T temporary = unsortedArray[firstIndex];
        unsortedArray[firstIndex] = unsortedArray[secondIndex];
        unsortedArray[secondIndex] = temporary;
    }

}
