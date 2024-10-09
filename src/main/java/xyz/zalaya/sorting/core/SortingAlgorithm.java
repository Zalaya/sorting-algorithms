package xyz.zalaya.sorting.core;

public interface SortingAlgorithm {

    <T extends Comparable<T>> T[] sort(T[] array);

}
