package xyz.zalaya.sorting.utilities;

public class ArrayUtilities {

    /**
     * Swap two elements in the array.
     * @param array The array to swap elements in.
     * @param firstIndex The index of the first element.
     * @param secondIndex The index of the second element.
     * @return The array with the elements swapped.
     */
    public static <T extends Comparable<T>> T[] swap(T[] array, int firstIndex, int secondIndex) {
        T temporary = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporary;

        return array;
    }

}
