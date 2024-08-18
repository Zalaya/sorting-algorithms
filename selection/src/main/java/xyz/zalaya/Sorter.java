package xyz.zalaya;

public class Sorter {

    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minimumElementIndex = findMinimumElementIndex(array, i);
            swapElements(array, i, minimumElementIndex);
        }
    }

    private int findMinimumElementIndex(int[] array, int startIndex) {
        int minimumElementIndex = startIndex;

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[minimumElementIndex]) {
                minimumElementIndex = i;
            }
        }

        return minimumElementIndex;
    }

    private void swapElements(int[] array, int firstIndex, int secondIndex) {
        int temporary = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporary;
    }

}
