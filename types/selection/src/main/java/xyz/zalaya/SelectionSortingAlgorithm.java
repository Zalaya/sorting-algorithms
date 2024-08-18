package xyz.zalaya;

import xyz.zalaya.models.SortingAlgorithm;
import xyz.zalaya.utilities.SortingAlgorithmArrayUtilities;

public class SelectionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        for (int currentIndex = 0; currentIndex < unsortedArray.length - 1; currentIndex++) {
            int minimumElementIndex = findMinimumElementIndex(unsortedArray, currentIndex);
            SortingAlgorithmArrayUtilities.swap(unsortedArray, currentIndex, minimumElementIndex);
        }

        return unsortedArray;
    }

    private <T extends Comparable<T>> int findMinimumElementIndex(T[] array, int startIndex) {
        int minimumElementIndex = startIndex;

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i].compareTo(array[minimumElementIndex]) < 0) {
                minimumElementIndex = i;
            }
        }

        return minimumElementIndex;
    }

}
