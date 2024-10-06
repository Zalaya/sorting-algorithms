package xyz.zalaya.sorting.core;

import java.util.List;

public interface SortingAlgorithm {

    <T extends Comparable<T>> T[] sort(T[] array);

    default <T extends Comparable<? super T>> List<T> sort(List<T> list) {
        return list.stream().sorted().toList();
    }

}
