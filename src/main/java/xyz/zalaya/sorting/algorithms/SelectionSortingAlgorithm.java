package xyz.zalaya.sorting.algorithms;

import xyz.zalaya.sorting.contracts.SortingAlgorithm;
import xyz.zalaya.sorting.utilities.ArrayUtilities;

/**
 * Implementation of the selection sorting algorithm.
 * It implements the {@link SortingAlgorithm} interface.
 */
public class SelectionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            iteration(array, i);
        }

        return array;
    }

    /**
     * Perform an iteration of the selection sorting algorithm.
     * @param array The array to sort.
     * @param startIndex The index to start sorting from.
     */
    private <T extends Comparable<T>> void iteration(T[] array, int startIndex) {
        ArrayUtilities.swap(array, startIndex, findMinimumElementIndex(array, startIndex));
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

}