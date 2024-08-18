package xyz.zalaya;

import xyz.zalaya.models.SortingAlgorithm;
import xyz.zalaya.utilities.ArrayUtilities;

public class BubbleSort implements SortingAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        Boolean swapped;

        for (int currentIndex = 0; currentIndex < unsortedArray.length - 1; currentIndex++) {
            swapped = bubbleUp(unsortedArray, currentIndex);
            if (!swapped) break;
        }

        return unsortedArray;
    }

    private <T extends Comparable<T>> Boolean bubbleUp(T[] array, int startIndex) {
        Boolean swapped = false;

        for (int currentIndex = 0; currentIndex < array.length - startIndex - 1; currentIndex++) {
            if (array[currentIndex].compareTo(array[currentIndex + 1]) > 0) {
                ArrayUtilities.swap(array, currentIndex, currentIndex + 1);
                swapped = true;
            }
        }

        return swapped;
    }

}