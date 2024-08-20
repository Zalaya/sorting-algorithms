package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;

public class BubbleSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            if (!isSwapPerformed(unsortedArray, unsortedArray.length - i - 1)) {
                break;
            }
        }

        return unsortedArray;
    }

    private <T extends Comparable<T>> boolean isSwapPerformed(T[] unsortedArray, int endIndex) {
        boolean swapped = false;

        for (int i = 0; i < endIndex; i++) {
            if (unsortedArray[i].compareTo(unsortedArray[i + 1]) > 0) {
                swap(unsortedArray, i, i + 1);
                swapped = true;
            }
        }

        return swapped;
    }

    private <T extends Comparable<T>> void swap(T[] unsortedArray, int firstIndex, int secondIndex) {
        T temporary = unsortedArray[firstIndex];
        unsortedArray[firstIndex] = unsortedArray[secondIndex];
        unsortedArray[secondIndex] = temporary;
    }

}
