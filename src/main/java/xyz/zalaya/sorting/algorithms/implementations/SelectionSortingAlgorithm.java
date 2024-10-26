package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;

/**
 * Implementation of the selection sorting algorithm.
 * It implements the {@link SortingAlgorithm} interface.
 */
public class SelectionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            pass(array, i);
        }

        return array;
    }

    /**
     * Perform a pass of the selection sorting algorithm.
     * @param array The array to sort.
     * @param startIndex The index to start sorting from.
     */
    private <T extends Comparable<T>> void pass(T[] array, int startIndex) {
        swap(array, startIndex, findMinimumElementIndex(array, startIndex));
    }

    /**
     * Find the index of the minimum element in the array.
     * @param array The array to search.
     * @param startIndex The index to start searching from.
     * @return The index of the minimum element.
     */
    private <T extends Comparable<T>> int findMinimumElementIndex(T[] array, int startIndex) {
        int minimumElementIndex = startIndex;

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i].compareTo(array[minimumElementIndex]) < 0) {
                minimumElementIndex = i;
            }
        }

        return minimumElementIndex;
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