package xyz.zalaya.sorting.algorithms;

import xyz.zalaya.sorting.contracts.SortingAlgorithm;

/**
 * Implementation of the insertion sorting algorithm.
 * It implements the {@link SortingAlgorithm} interface.
 */
public class InsertionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            iteration(array, i);
        }

        return array;
    }

    /**
     * Perform an iteration of the insertion sorting algorithm.
     * @param array The array to sort.
     * @param startIndex The index to start sorting from.
     */
    private <T extends Comparable<T>> void iteration(T[] array, int startIndex) {
        int insertionIndex = findInsertionIndex(array, startIndex);
        T element = array[startIndex];

        for (int i = startIndex; i > insertionIndex; i--) {
            array[i] = array[i - 1];
        }

        array[insertionIndex] = element;
    }

    /**
     * Find the index where the element at the startIndex should be inserted.
     * @param array The array to find the insertion index in.
     * @param startIndex The index to start finding the insertion index from.
     * @return The index where the element at the startIndex should be inserted.
     */
    private <T extends Comparable<T>> int findInsertionIndex(T[] array, int startIndex) {
        int insertionIndex = startIndex;

        for (int i = startIndex - 1; i >= 0 && array[i].compareTo(array[startIndex]) > 0; i--) {
            insertionIndex = i;
        }

        return insertionIndex;
    }

}