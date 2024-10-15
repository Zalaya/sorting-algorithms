package xyz.zalaya.sorting.utilities;

public class ArrayUtilities {

    /**
     * Swap two elements in the array.
     * @param array The array to swap elements in.
     * @param firstIndex The index of the first element.
     * @param secondIndex The index of the second element.
     */
    public static <T extends Comparable<T>> void swap(T[] array, int firstIndex, int secondIndex) {
        T temporary = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporary;
    }

    /**
     * Find the index of the minimum element in the array.
     * @param array The array to search.
     * @param startIndex The index to start searching from.
     * @return The index of the minimum element.
     */
    public static <T extends Comparable<T>> int findMinimumElementIndex(T[] array, int startIndex) {
        int minimumElementIndex = startIndex;

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i].compareTo(array[minimumElementIndex]) < 0) {
                minimumElementIndex = i;
            }
        }

        return minimumElementIndex;
    }

    /**
     * Insert an element into the array at the specified index.
     * @param array The array to insert the element into.
     * @param element The element to insert.
     * @param currentIndex The current index of the element.
     * @param insertionIndex The index to insert the element at.
     */
    public static <T extends Comparable<T>> void insertElement(T[] array, T element, int currentIndex, int insertionIndex) {
        for (int i = currentIndex; i > insertionIndex; i--) {
            array[i] = array[i - 1];
        }

        array[insertionIndex] = element;
    }

}