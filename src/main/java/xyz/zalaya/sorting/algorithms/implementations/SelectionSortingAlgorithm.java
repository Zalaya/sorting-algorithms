package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;

import static xyz.zalaya.sorting.utilities.ArrayUtilities.findMinimumElementIndex;
import static xyz.zalaya.sorting.utilities.ArrayUtilities.swap;

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

}