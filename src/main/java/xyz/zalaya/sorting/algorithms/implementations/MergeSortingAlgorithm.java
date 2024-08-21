package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;

import java.util.Arrays;

public class MergeSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        recursiveMergeAndSortSubArrays(unsortedArray, 0, unsortedArray.length - 1);

        return unsortedArray;
    }

    private <T extends Comparable<T>> void recursiveMergeAndSortSubArrays(T[] unsortedArray, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;

            recursiveMergeAndSortSubArrays(unsortedArray, startIndex, middleIndex);
            recursiveMergeAndSortSubArrays(unsortedArray, middleIndex + 1, endIndex);

            mergeAndSortSubArrays(unsortedArray, startIndex, middleIndex, endIndex);
        }
    }

    private <T extends Comparable<T>> void mergeAndSortSubArrays(T[] mergedArray, int startIndex, int middleIndex, int endIndex) {
        T[] firstSubArray = extractSubArray(mergedArray, startIndex, middleIndex);
        T[] secondSubArray = extractSubArray(mergedArray, middleIndex + 1, endIndex);

        int firstSubArrayIndex = 0;
        int secondSubArrayIndex = 0;
        int mergedArrayIndex = startIndex;

        while (firstSubArrayIndex < firstSubArray.length && secondSubArrayIndex < secondSubArray.length) {
            if (firstSubArray[firstSubArrayIndex].compareTo(secondSubArray[secondSubArrayIndex]) <= 0) {
                mergedArray[mergedArrayIndex++] = firstSubArray[firstSubArrayIndex++];
            } else {
                mergedArray[mergedArrayIndex++] = secondSubArray[secondSubArrayIndex++];
            }
        }

        copyRemainingElements(mergedArray, firstSubArray, firstSubArrayIndex, mergedArrayIndex);
        copyRemainingElements(mergedArray, secondSubArray, secondSubArrayIndex, mergedArrayIndex);
    }

    private <T extends Comparable<T>> T[] extractSubArray(T[] unsortedArray, int startIndex, int endIndex) {
        return Arrays.copyOfRange(unsortedArray, startIndex, endIndex + 1);
    }

    private <T extends Comparable<T>> void copyRemainingElements(T[] mergedArray, T[] subArray, int subArrayIndex, int mergedArrayIndex) {
        while (subArrayIndex < subArray.length) {
            mergedArray[mergedArrayIndex++] = subArray[subArrayIndex++];
        }
    }

}
