package xyz.zalaya.sorting.contracts;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Abstract class for testing sorting algorithms.
 */
public abstract class SortingAlgorithmTest {

    /**
     * Get the sorting algorithm to test.
     * @return The sorting algorithm to test.
     */
    public abstract SortingAlgorithm getSortingAlgorithm();

    /**
     * Get a stream of arguments for testing sorting algorithms with integer arrays.
     * @return A stream of arguments for testing sorting algorithms with integer arrays.
     */
    private static Stream<Arguments> getIntegerArrays() {
        return Stream.of(
            Arguments.of(new Integer[] { }, new Integer[] { }),
            Arguments.of(new Integer[] { 1 }, new Integer[] { 1 }),
            Arguments.of(new Integer[] { 3, 1, 4, 1, 5, 9, 2, 6, 5 }, new Integer[] { 1, 1, 2, 3, 4, 5, 5, 6, 9 }),
            Arguments.of(new Integer[] { Integer.MAX_VALUE, 0, Integer.MIN_VALUE }, new Integer[] { Integer.MIN_VALUE, 0, Integer.MAX_VALUE })
        );
    }

    /**
     * Get a stream of arguments for testing sorting algorithms with double arrays.
     * @return A stream of arguments for testing sorting algorithms with double arrays.
     */
    private static Stream<Arguments> getDoubleArrays() {
        return Stream.of(
            Arguments.of(new Double[] { }, new Double[] { }),
            Arguments.of(new Double[] { 1.0 }, new Double[] { 1.0 }),
            Arguments.of(new Double[] { 3.0, 1.0, 4.0, 1.0, 5.0, 9.0, 2.0, 6.0, 5.0 }, new Double[] { 1.0, 1.0, 2.0, 3.0, 4.0, 5.0, 5.0, 6.0, 9.0 }),
            Arguments.of(new Double[] { Double.MAX_VALUE, 0.0, -Double.MAX_VALUE }, new Double[] { -Double.MAX_VALUE, 0.0, Double.MAX_VALUE })
        );
    }

    /**
     * Get a stream of arguments for testing sorting algorithms with long arrays.
     * @return A stream of arguments for testing sorting algorithms with long arrays.
     */
    private static Stream<Arguments> getLongArrays() {
        return Stream.of(
            Arguments.of(new Long[] { }, new Long[] { }),
            Arguments.of(new Long[] { 1L }, new Long[] { 1L }),
            Arguments.of(new Long[] { 3L, 1L, 4L, 1L, 5L, 9L, 2L, 6L, 5L }, new Long[] { 1L, 1L, 2L, 3L, 4L, 5L, 5L, 6L, 9L }),
            Arguments.of(new Long[] { Long.MAX_VALUE, 0L, Long.MIN_VALUE }, new Long[] { Long.MIN_VALUE, 0L, Long.MAX_VALUE })
        );
    }

    /**
     * Get a stream of arguments for testing sorting algorithms with character arrays.
     * @return A stream of arguments for testing sorting algorithms with character arrays.
     */
    private static Stream<Arguments> getCharacterArrays() {
        return Stream.of(
            Arguments.of(new Character[] { }, new Character[] { }),
            Arguments.of(new Character[] { 'a' }, new Character[] { 'a' }),
            Arguments.of(new Character[] { 'c', 'a', 'd', 'a', 'e', 'i', 'b', 'f', 'e' }, new Character[] { 'a', 'a', 'b', 'c', 'd', 'e', 'e', 'f', 'i' }),
            Arguments.of(new Character[] { Character.MAX_VALUE, 'a', Character.MIN_VALUE }, new Character[] { Character.MIN_VALUE, 'a', Character.MAX_VALUE })
        );
    }

    /**
     * Test that the sorting algorithm sorts the array correctly.
     * @param unsortedArray The unsorted array.
     * @param expectedSortedArray The expected sorted array.
     */
    @ParameterizedTest
    @MethodSource({ "getIntegerArrays", "getDoubleArrays", "getLongArrays", "getCharacterArrays" })
    public <T extends Comparable<T>> void shouldSortArray(T[] unsortedArray, T[] expectedSortedArray) {
        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

    /**
     * Test that the sorting algorithm sorts the list correctly.
     * @param unsortedArray The unsorted array.
     * @param expectedSortedArray The expected sorted array.
     */
    @ParameterizedTest
    @MethodSource({ "getIntegerArrays", "getDoubleArrays", "getLongArrays", "getCharacterArrays" })
    public <T extends Comparable<T>> void shouldSortList(T[] unsortedArray, T[] expectedSortedArray) {
        List<T> unsortedList = Arrays.asList(unsortedArray);
        List<T> expectedSortedList = Arrays.asList(expectedSortedArray);

        assertEquals(expectedSortedList, getSortingAlgorithm().sort(unsortedList));
    }

}