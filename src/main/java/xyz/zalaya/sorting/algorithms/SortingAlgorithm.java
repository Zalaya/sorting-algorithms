package xyz.zalaya.sorting.algorithms;

import java.util.Arrays;
import java.util.List;

/**
 * Interface for sorting algorithms.
 */
public interface SortingAlgorithm {

    /**
     * Sort an array of elements.
     * @param array The array to sort.
     * @return The sorted array.
     */
    <T extends Comparable<T>> T[] sort(T[] array);

    /**
     * Sort a list of elements.
     * @param list The list to sort.
     * @return The sorted list.
     */
    @SuppressWarnings("unchecked")
    default <T extends Comparable<T>> List<T> sort(List<T> list) {
        return Arrays.asList(sort(list.toArray((T[]) new Comparable[list.size()])));
    }

}
