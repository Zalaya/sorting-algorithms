package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;

import static xyz.zalaya.sorting.utilities.ArrayUtilities.insertElement;

/**
 * Implementation of the insertion sorting algorithm.
 * It implements the {@link SortingAlgorithm} interface.
 */
public class InsertionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            pass(array, i);
        }

        return array;
    }

    /**
     * Perform a pass of the insertion sorting algorithm.
     * @param array The array to sort.
     * @param startIndex The index to start sorting from.
     */
    private <T extends Comparable<T>> void pass(T[] array, int startIndex) {
        insertElement(array, array[startIndex], startIndex, findInsertionIndex(array, startIndex));
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