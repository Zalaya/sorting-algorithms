package xyz.zalaya.sorting.algorithms;

public interface SortingAlgorithm {

    <T extends Comparable<T>> T[] sort(T[] array);

}
