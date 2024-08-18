package xyz.zalaya;

public class Sorter {

    public void sort(int[] array) {
        boolean swapped;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = performSinglePass(array, i);
            if (!swapped) break;
        }
    }

    private boolean performSinglePass(int[] array, int passIndex) {
        boolean swapped = false;

        for (int j = 0; j < array.length - 1 - passIndex; j++) {
            if (array[j] > array[j + 1]) {
                swapElements(array, j, j + 1);
                swapped = true;
            }
        }

        return swapped;
    }

    private void swapElements(int[] array, int firstIndex, int secondIndex) {
        int temporary = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporary;
    }
}