package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;

public class QuickSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        recursiveSortArray(unsortedArray, 0, unsortedArray.length - 1);

        return unsortedArray;
    }

    private <T extends Comparable<T>> int partition(T[] unsortedArray, int startIndex, int endIndex) {
        T pivot = unsortedArray[endIndex];
        int partitionIndex = startIndex;

        for (int i = startIndex; i < endIndex; i++) {
            if (unsortedArray[i].compareTo(pivot) <= 0) {
                swap(unsortedArray, i, partitionIndex++);
            }
        }

        swap(unsortedArray, partitionIndex, endIndex);

        return partitionIndex;
    }

    private <T extends Comparable<T>> void recursiveSortArray(T[] unsortedArray, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partitionIndex = partition(unsortedArray, startIndex, endIndex);

            recursiveSortArray(unsortedArray, startIndex, partitionIndex - 1);
            recursiveSortArray(unsortedArray, partitionIndex + 1, endIndex);
        }
    }

    private <T extends Comparable<T>> void swap(T[] unsortedArray, int firstIndex, int secondIndex) {
        T temporary = unsortedArray[firstIndex];
        unsortedArray[firstIndex] = unsortedArray[secondIndex];
        unsortedArray[secondIndex] = temporary;
    }

}
