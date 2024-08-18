package xyz.zalaya.utilities;

public class ArrayUtilities {

    public static <T extends Comparable<T>> void swap(T[] array, int firstIndex, int secondIndex) {
        T temporary = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporary;
    }

    public static <T extends Comparable<T>> void flip(T[] array, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            swap(array, startIndex++, endIndex--);
        }
    }

}
