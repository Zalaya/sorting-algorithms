package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;

import static xyz.zalaya.sorting.utilities.ArrayUtilities.swap;

/**
 * Implementation of the quick sorting algorithm.
 * It implements the {@link SortingAlgorithm} interface.
 */
public class QuickSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        pass(array, 0, array.length - 1);

        return array;
    }

    /**
     * Perform a pass of the quick sorting algorithm.
     * @param array The array to sort.
     * @param startIndex The index to start sorting from.
     * @param endIndex The index to end sorting at.
     */
    private <T extends Comparable<T>> void pass(T[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partitionIndex = partition(array, startIndex, endIndex);

            pass(array, startIndex, partitionIndex - 1);
            pass(array, partitionIndex + 1, endIndex);
        }
    }

    /**
     * Partition the array by selecting a pivot and moving all elements less than the pivot to the left of it.
     * @param array The array to partition.
     * @param startIndex The index to start partitioning from.
     * @param endIndex The index to end partitioning at.
     * @return The partition index.
     */
    private <T extends Comparable<T>> int partition(T[] array, int startIndex, int endIndex) {
        T pivot = array[endIndex];
        int partitionIndex = startIndex;

        for (int i = startIndex; i < endIndex; i++) {
            if (array[i].compareTo(pivot) <= 0) {
                swap(array, i, partitionIndex++);
            }
        }

        swap(array, partitionIndex, endIndex);

        return partitionIndex;
    }

}
