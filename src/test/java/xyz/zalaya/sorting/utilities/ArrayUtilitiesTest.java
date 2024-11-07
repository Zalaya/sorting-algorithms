package xyz.zalaya.sorting.utilities;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for the {@link ArrayUtilities} class.
 */
public class ArrayUtilitiesTest {

    /**
     * Get a stream of arguments for testing the swap method with integer arrays.
     * @return A stream of arguments for testing the swap method with integer arrays.
     */
    private static Stream<Arguments> getIntegerArrays() {
        return Stream.of(
            Arguments.of(new Integer[] { 1, 2, 3, 4, 5 }, new Integer[] { 5, 2, 3, 4, 1 })
        );
    }

    /**
     * Get a stream of arguments for testing the swap method with double arrays.
     * @return A stream of arguments for testing the swap method with double arrays.
     */
    private static Stream<Arguments> getDoubleArrays() {
        return Stream.of(
            Arguments.of(new Double[] { 1.0, 2.0, 3.0, 4.0, 5.0 }, new Double[] { 5.0, 2.0, 3.0, 4.0, 1.0 })
        );
    }

    /**
     * Get a stream of arguments for testing the swap method with long arrays.
     * @return A stream of arguments for testing the swap method with long arrays.
     */
    private static Stream<Arguments> getLongArrays() {
        return Stream.of(
            Arguments.of(new Long[] { 1L, 2L, 3L, 4L, 5L }, new Long[] { 5L, 2L, 3L, 4L, 1L })
        );
    }

    /**
     * Get a stream of arguments for testing the swap method with character arrays.
     * @return A stream of arguments for testing the swap method with character arrays.
     */
    private static Stream<Arguments> getCharacterArrays() {
        return Stream.of(
            Arguments.of(new Character[] { 'a', 'b', 'c', 'd', 'e' }, new Character[] { 'e', 'b', 'c', 'd', 'a' })
        );
    }

    /**
     * Test that the swap method swaps the array correctly.
     * @param unswappedArray The array to swap.
     * @param expectedSwappedArray The expected swapped array.
     */
    @ParameterizedTest
    @MethodSource({ "getIntegerArrays", "getDoubleArrays", "getLongArrays", "getCharacterArrays" })
    public <T extends Comparable<T>> void shouldSwapArray(T[] unswappedArray, T[] expectedSwappedArray) {
        assertArrayEquals(expectedSwappedArray, ArrayUtilities.swap(unswappedArray, 0, unswappedArray.length - 1));
    }

}
