package xyz.zalaya;

import xyz.zalaya.models.SortingAlgorithm;

public class InsertionSort implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        for (int currentIndex = 1; currentIndex < unsortedArray.length; currentIndex++) {
            insertElement(unsortedArray, currentIndex);
        }

        return unsortedArray;
    }

    private <T extends Comparable<T>> void insertElement(T[] array, int currentIndex) {
        T currentElement = array[currentIndex];
        int previousIndex = currentIndex - 1;

        while (previousIndex >= 0 && array[previousIndex].compareTo(currentElement) > 0) {
            array[previousIndex + 1] = array[previousIndex];
            previousIndex = previousIndex - 1;
        }

        array[previousIndex + 1] = currentElement;
    }
}