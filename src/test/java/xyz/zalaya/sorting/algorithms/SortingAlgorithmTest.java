package xyz.zalaya.sorting.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public abstract class SortingAlgorithmTest {

    public abstract SortingAlgorithm getSortingAlgorithm();

    @Test
    public void shouldSortEmptyIntegerArray() {
        Integer[] unsortedArray = new Integer[] { };
        Integer[] expectedSortedArray = new Integer[] { };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortSingleIntegerArray() {
        Integer[] unsortedArray = new Integer[] { 1 };
        Integer[] expectedSortedArray = new Integer[] { 1 };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortUnsortedIntegerArray() {
        Integer[] unsortedArray = new Integer[] { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
        Integer[] expectedSortedArray = new Integer[] { 1, 1, 2, 3, 4, 5, 5, 6, 9 };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortEmptyDoubleArray() {
        Double[] unsortedArray = new Double[] { };
        Double[] expectedSortedArray = new Double[] { };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortSingleDoubleArray() {
        Double[] unsortedArray = new Double[] { 1.0 };
        Double[] expectedSortedArray = new Double[] { 1.0 };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortUnsortedDoubleArray() {
        Double[] unsortedArray = new Double[] { 3.0, 1.0, 4.0, 1.0, 5.0, 9.0, 2.0, 6.0, 5.0 };
        Double[] expectedSortedArray = new Double[] { 1.0, 1.0, 2.0, 3.0, 4.0, 5.0, 5.0, 6.0, 9.0 };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortEmptyByteArray() {
        Byte[] unsortedArray = new Byte[] { };
        Byte[] expectedSortedArray = new Byte[] { };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortSingleByteArray() {
        Byte[] unsortedArray = new Byte[] { 1 };
        Byte[] expectedSortedArray = new Byte[] { 1 };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortUnsortedByteArray() {
        Byte[] unsortedArray = new Byte[] { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
        Byte[] expectedSortedArray = new Byte[] { 1, 1, 2, 3, 4, 5, 5, 6, 9 };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortEmptyShortArray() {
        Short[] unsortedArray = new Short[] { };
        Short[] expectedSortedArray = new Short[] { };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortSingleShortArray() {
        Short[] unsortedArray = new Short[] { 1 };
        Short[] expectedSortedArray = new Short[] { 1 };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortUnsortedShortArray() {
        Short[] unsortedArray = new Short[] { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
        Short[] expectedSortedArray = new Short[] { 1, 1, 2, 3, 4, 5, 5, 6, 9 };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortEmptyLongArray() {
        Long[] unsortedArray = new Long[] { };
        Long[] expectedSortedArray = new Long[] { };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortSingleLongArray() {
        Long[] unsortedArray = new Long[] { 1L };
        Long[] expectedSortedArray = new Long[] { 1L };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortUnsortedLongArray() {
        Long[] unsortedArray = new Long[] { 3L, 1L, 4L, 1L, 5L, 9L, 2L, 6L, 5L };
        Long[] expectedSortedArray = new Long[] { 1L, 1L, 2L, 3L, 4L, 5L, 5L, 6L, 9L };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortEmptyFloatArray() {
        Float[] unsortedArray = new Float[] { };
        Float[] expectedSortedArray = new Float[] { };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortSingleFloatArray() {
        Float[] unsortedArray = new Float[] { 1.0f };
        Float[] expectedSortedArray = new Float[] { 1.0f };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortUnsortedFloatArray() {
        Float[] unsortedArray = new Float[] { 3.0f, 1.0f, 4.0f, 1.0f, 5.0f, 9.0f, 2.0f, 6.0f, 5.0f };
        Float[] expectedSortedArray = new Float[] { 1.0f, 1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 5.0f, 6.0f, 9.0f };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortEmptyBooleanArray() {
        Boolean[] unsortedArray = new Boolean[] { };
        Boolean[] expectedSortedArray = new Boolean[] { };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortSingleBooleanArray() {
        Boolean[] unsortedArray = new Boolean[] { true };
        Boolean[] expectedSortedArray = new Boolean[] { true };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortUnsortedBooleanArray() {
        Boolean[] unsortedArray = new Boolean[] { true, false, true, false, true, false, true, false, true };
        Boolean[] expectedSortedArray = new Boolean[] { false, false, false, false, true, true, true, true, true };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortEmptyCharacterArray() {
        Character[] unsortedArray = new Character[] { };
        Character[] expectedSortedArray = new Character[] { };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortSingleCharacterArray() {
        Character[] unsortedArray = new Character[] { 'a' };
        Character[] expectedSortedArray = new Character[] { 'a' };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortUnsortedCharacterArray() {
        Character[] unsortedArray = new Character[] { 'c', 'a', 'd', 'a', 'e', 'i', 'b', 'f', 'e' };
        Character[] expectedSortedArray = new Character[] { 'a', 'a', 'b', 'c', 'd', 'e', 'e', 'f', 'i' };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortEmptyStringArray() {
        String[] unsortedArray = new String[] { };
        String[] expectedSortedArray = new String[] { };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortSingleStringArray() {
        String[] unsortedArray = new String[] { "a" };
        String[] expectedSortedArray = new String[] { "a" };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    @Test
    public void shouldSortUnsortedStringArray() {
        String[] unsortedArray = new String[] { "c", "a", "d", "a", "e", "i", "b", "f", "e" };
        String[] expectedSortedArray = new String[] { "a", "a", "b", "c", "d", "e", "e", "f", "i" };

        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

}
