package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;

public class InsertionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {
            insertSortedElement(unsortedArray, i);
        }

        return unsortedArray;
    }

    private <T extends Comparable<T>> void insertSortedElement(T[] unsortedArray, int elementIndex) {
        T elementValue = unsortedArray[elementIndex];
        int previousIndex = elementIndex - 1;

        while (previousIndex >= 0 && unsortedArray[previousIndex].compareTo(elementValue) > 0) {
            unsortedArray[previousIndex + 1] = unsortedArray[previousIndex];
            previousIndex--;
        }

        unsortedArray[previousIndex + 1] = elementValue;
    }

}
