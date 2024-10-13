package xyz.zalaya.sorting.algorithms;

import java.util.Arrays;
import java.util.List;

public interface SortingAlgorithm {

    <T extends Comparable<T>> T[] sort(T[] array);

    @SuppressWarnings("unchecked")
    default <T extends Comparable<T>> List<T> sort(List<T> list) {
        return Arrays.asList(sort(list.toArray((T[]) new Comparable[list.size()])));
    }

}
