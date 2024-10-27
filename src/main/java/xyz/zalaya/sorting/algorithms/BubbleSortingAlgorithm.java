package xyz.zalaya.sorting.algorithms;

import xyz.zalaya.sorting.contracts.SortingAlgorithm;

import static xyz.zalaya.sorting.utilities.SwapUtilities.swap;

/**
 * Implementation of the bubble sorting algorithm.
 * It implements the {@link SortingAlgorithm} interface.
 */
public class BubbleSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (!iteration(array, i)) {
                break;
            }
        }

        return array;
    }

    /**
     * Perform an iteration of the bubble sorting algorithm.
     * @param array The array to sort.
     * @param startIndex The index to start sorting from.
     * @return True if a swap was performed, false otherwise.
     */
    private <T extends Comparable<T>> boolean iteration(T[] array, int startIndex) {
        boolean swapped = false;

        for (int i = 0; i < array.length - startIndex - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                swap(array, i, i + 1);
                swapped = true;
            }
        }

        return swapped;
    }

}