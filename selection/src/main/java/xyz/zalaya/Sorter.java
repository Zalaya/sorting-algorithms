package xyz.zalaya;

public class Sorter {

    public void sort(int[] array) {
        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++) {
            int minimumElementIndex = findMinimumElementIndex(array, currentIndex);
            swapElements(array, currentIndex, minimumElementIndex);
        }
    }

    private int findMinimumElementIndex(int[] array, int startIndex) {
        int minimumElementIndex = startIndex;

        for (int currentIndex = startIndex + 1; currentIndex < array.length; currentIndex++) {
            if (array[currentIndex] < array[minimumElementIndex]) {
                minimumElementIndex = currentIndex;
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
