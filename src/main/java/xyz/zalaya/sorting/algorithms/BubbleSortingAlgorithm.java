package xyz.zalaya.sorting.algorithms;

import xyz.zalaya.sorting.contracts.SortingAlgorithm;

/**
 * Implementation of the bubble sorting algorithm.
 * It implements the {@link SortingAlgorithm} interface.
 */
public class BubbleSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (!pass(array, i)) {
                break;
            }
        }

        return array;
    }

    /**
     * Perform a pass of the bubble sorting algorithm.
     * @param array The array to sort.
     * @param startIndex The index to start sorting from.
     * @return True if a swap was performed, false otherwise.
     */
    private <T extends Comparable<T>> boolean pass(T[] array, int startIndex) {
        boolean swapped = false;

        for (int i = 0; i < array.length - startIndex - 1; i++) {
            if (performSwapIfNeeded(array, i, i + 1)) {
                swapped = true;
            }
        }

        return swapped;
    }

    /**
     * Swap two elements in the array if the first element is greater than the second element.
     * @param array The array to swap elements in.
     * @param firstIndex The index of the first element.
     * @param secondIndex The index of the second element.
     * @return True if the elements were swapped, false otherwise.
     */
    private <T extends Comparable<T>> boolean performSwapIfNeeded(T[] array, int firstIndex, int secondIndex) {
        if (array[firstIndex].compareTo(array[secondIndex]) > 0) {
            swap(array, firstIndex, secondIndex);
            return true;
        }

        return false;
    }

    /**
     * Swap two elements in the array.
     * @param array The array to swap elements in.
     * @param firstIndex The index of the first element.
     * @param secondIndex The index of the second element.
     */
    private <T extends Comparable<T>> void swap(T[] array, int firstIndex, int secondIndex) {
        T temporary = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporary;
    }

}