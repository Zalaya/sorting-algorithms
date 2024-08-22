package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;

public class HeapSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        for (int i = unsortedArray.length / 2 - 1; i >= 0; i--) {
            ensureHeapProperty(unsortedArray, i, unsortedArray.length);
        }

        for (int i = unsortedArray.length - 1; i >= 0; i--) {
            swap(unsortedArray, 0, i);
            ensureHeapProperty(unsortedArray, 0, i);
        }

        return unsortedArray;
    }

    private <T extends Comparable<T>> void ensureHeapProperty(T[] unsortedArray, int rootIndex, int heapSize) {
        int leftChildIndex = 2 * rootIndex + 1;
        int rightChildIndex = 2 * rootIndex + 2;

        int maximumElementIndex = findMaximumElementIndex(unsortedArray, rootIndex, leftChildIndex, rightChildIndex, heapSize);

        if (maximumElementIndex != rootIndex) {
            swap(unsortedArray, rootIndex, maximumElementIndex);
            ensureHeapProperty(unsortedArray, maximumElementIndex, heapSize);
        }
    }

    private <T extends Comparable<T>> int findMaximumElementIndex(T[] unsortedArray, int rootIndex, int leftChildIndex, int rightChildIndex, int heapSize) {
        int maximumElementIndex = rootIndex;

        if (leftChildIndex < heapSize && unsortedArray[leftChildIndex].compareTo(unsortedArray[maximumElementIndex]) > 0) {
            maximumElementIndex = leftChildIndex;
        }

        if (rightChildIndex < heapSize && unsortedArray[rightChildIndex].compareTo(unsortedArray[maximumElementIndex]) > 0) {
            maximumElementIndex = rightChildIndex;
        }

        return maximumElementIndex;
    }

    private <T extends Comparable<T>> void swap(T[] unsortedArray, int firstIndex, int secondIndex) {
        T temporary = unsortedArray[firstIndex];
        unsortedArray[firstIndex] = unsortedArray[secondIndex];
        unsortedArray[secondIndex] = temporary;
    }

}
