package xyz.zalaya;

public class Sorter {

    public void sort(int[] array) {
        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++) {
            int minimumIndex = findMinimumIndex(array, currentIndex);
            swapElements(array, currentIndex, minimumIndex);
        }
    }

    private int findMinimumIndex(int[] array, int startIndex) {
        int minimumIndex = startIndex;

        for (int currentIndex = startIndex + 1; currentIndex < array.length; currentIndex++) {
            if (array[currentIndex] < array[minimumIndex]) {
                minimumIndex = currentIndex;
            }
        }

        return minimumIndex;
    }

    private void swapElements(int[] array, int firstIndex, int secondIndex) {
        int temporary = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporary;
    }

}
