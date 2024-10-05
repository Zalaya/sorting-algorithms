package xyz.zalaya.sorting.core;

import java.util.Arrays;
import java.util.List;

public interface SortingAlgorithm {

    <T extends Comparable<T>> T[] sort(T[] unsortedArray);

    @SuppressWarnings("unchecked")
    default <T extends Comparable<T>> List<T> sort(List<T> unsortedList) {
        return Arrays.asList(sort(unsortedList.toArray((T[]) new Comparable[unsortedList.size()])));
    }

}
