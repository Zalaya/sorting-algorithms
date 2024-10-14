package xyz.zalaya.sorting.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
     * Get a stream of arguments for testing sorting algorithms with byte arrays.
     * @return A stream of arguments for testing sorting algorithms with byte arrays.
     */
    private static Stream<Arguments> getByteArrays() {
        return Stream.of(
            Arguments.of(new Byte[] { }, new Byte[] { }),
            Arguments.of(new Byte[] { 1 }, new Byte[] { 1 }),
            Arguments.of(new Byte[] { 3, 1, 4, 1, 5, 9, 2, 6, 5 }, new Byte[] { 1, 1, 2, 3, 4, 5, 5, 6, 9 }),
            Arguments.of(new Byte[] { Byte.MAX_VALUE, 0, Byte.MIN_VALUE }, new Byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE })
        );
    }

    /**
     * Get a stream of arguments for testing sorting algorithms with short arrays.
     * @return A stream of arguments for testing sorting algorithms with short arrays.
     */
    private static Stream<Arguments> getShortArray() {
        return Stream.of(
            Arguments.of(new Short[] { }, new Short[] { }),
            Arguments.of(new Short[] { 1 }, new Short[] { 1 }),
            Arguments.of(new Short[] { 3, 1, 4, 1, 5, 9, 2, 6, 5 }, new Short[] { 1, 1, 2, 3, 4, 5, 5, 6, 9 }),
            Arguments.of(new Short[] { Short.MAX_VALUE, 0, Short.MIN_VALUE }, new Short[] { Short.MIN_VALUE, 0, Short.MAX_VALUE })
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
     * Get a stream of arguments for testing sorting algorithms with float arrays.
     * @return A stream of arguments for testing sorting algorithms with float arrays.
     */
    private static Stream<Arguments> getFloatArrays() {
        return Stream.of(
            Arguments.of(new Float[] { }, new Float[] { }),
            Arguments.of(new Float[] { 1.0f }, new Float[] { 1.0f }),
            Arguments.of(new Float[] { 3.0f, 1.0f, 4.0f, 1.0f, 5.0f, 9.0f, 2.0f, 6.0f, 5.0f }, new Float[] { 1.0f, 1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 5.0f, 6.0f, 9.0f }),
            Arguments.of(new Float[] { Float.MAX_VALUE, 0.0f, -Float.MAX_VALUE }, new Float[] { -Float.MAX_VALUE, 0.0f, Float.MAX_VALUE })
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
    @MethodSource({ "getIntegerArrays", "getDoubleArrays", "getByteArrays", "getShortArray", "getLongArrays", "getFloatArrays", "getCharacterArrays" })
    public <T extends Comparable<T>> void shouldSortArray(T[] unsortedArray, T[] expectedSortedArray) {
        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

}
