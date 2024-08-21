package xyz.zalaya.sorting.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public abstract class SortingAlgorithmTest {

    public abstract SortingAlgorithm getSortingAlgorithm();

    private static Stream<Arguments> getIntegerArrays() {
        return Stream.of(
            Arguments.of(new Integer[] { 3, 1, 4, 1, 5, 9, 2, 6, 5 }, new Integer[] { 1, 1, 2, 3, 4, 5, 5, 6, 9 }),
            Arguments.of(new Integer[] { }, new Integer[] { }),
            Arguments.of(new Integer[] { 1 }, new Integer[] { 1 }),
            Arguments.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
            Arguments.of(new Integer[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 }, new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
            Arguments.of(new Integer[] { Integer.MAX_VALUE, 0, Integer.MIN_VALUE }, new Integer[] { Integer.MIN_VALUE, 0, Integer.MAX_VALUE }),
            Arguments.of(new Integer[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new Integer[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }),
            Arguments.of(new Integer[] { -1, -2, -3, -4, -5, -6, -7, -8, -9 }, new Integer[] { -9, -8, -7, -6, -5, -4, -3, -2, -1 })
        );
    }

    private static Stream<Arguments> getDoubleArrays() {
        return Stream.of(
            Arguments.of(new Double[] { 3.0, 1.0, 4.0, 1.0, 5.0, 9.0, 2.0, 6.0, 5.0 }, new Double[] { 1.0, 1.0, 2.0, 3.0, 4.0, 5.0, 5.0, 6.0, 9.0 }),
            Arguments.of(new Double[] { }, new Double[] { }),
            Arguments.of(new Double[] { 1.0 }, new Double[] { 1.0 }),
            Arguments.of(new Double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0 }, new Double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0 }),
            Arguments.of(new Double[] { 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0 }, new Double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0 }),
            Arguments.of(new Double[] { Double.MAX_VALUE, 0.0, -Double.MAX_VALUE }, new Double[] { -Double.MAX_VALUE, 0.0, Double.MAX_VALUE }),
            Arguments.of(new Double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0 }, new Double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0 }),
            Arguments.of(new Double[] { -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0 }, new Double[] { -9.0, -8.0, -7.0, -6.0, -5.0, -4.0, -3.0, -2.0, -1.0 })
        );
    }

    private static Stream<Arguments> getByteArrays() {
        return Stream.of(
            Arguments.of(new Byte[] { 3, 1, 4, 1, 5, 9, 2, 6, 5 }, new Byte[] { 1, 1, 2, 3, 4, 5, 5, 6, 9 }),
            Arguments.of(new Byte[] { }, new Byte[] { }),
            Arguments.of(new Byte[] { 1 }, new Byte[] { 1 }),
            Arguments.of(new Byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new Byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
            Arguments.of(new Byte[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 }, new Byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
            Arguments.of(new Byte[] { Byte.MAX_VALUE, 0, Byte.MIN_VALUE }, new Byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }),
            Arguments.of(new Byte[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new Byte[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }),
            Arguments.of(new Byte[] { -1, -2, -3, -4, -5, -6, -7, -8, -9 }, new Byte[] { -9, -8, -7, -6, -5, -4, -3, -2, -1 })
        );
    }

    private static Stream<Arguments> getShortArray() {
        return Stream.of(
            Arguments.of(new Short[] { 3, 1, 4, 1, 5, 9, 2, 6, 5 }, new Short[] { 1, 1, 2, 3, 4, 5, 5, 6, 9 }),
            Arguments.of(new Short[] { }, new Short[] { }),
            Arguments.of(new Short[] { 1 }, new Short[] { 1 }),
            Arguments.of(new Short[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new Short[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
            Arguments.of(new Short[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 }, new Short[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
            Arguments.of(new Short[] { Short.MAX_VALUE, 0, Short.MIN_VALUE }, new Short[] { Short.MIN_VALUE, 0, Short.MAX_VALUE }),
            Arguments.of(new Short[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new Short[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }),
            Arguments.of(new Short[] { -1, -2, -3, -4, -5, -6, -7, -8, -9 }, new Short[] { -9, -8, -7, -6, -5, -4, -3, -2, -1 })
        );
    }

    private static Stream<Arguments> getLongArrays() {
        return Stream.of(
            Arguments.of(new Long[] { 3L, 1L, 4L, 1L, 5L, 9L, 2L, 6L, 5L }, new Long[] { 1L, 1L, 2L, 3L, 4L, 5L, 5L, 6L, 9L }),
            Arguments.of(new Long[] { }, new Long[] { }),
            Arguments.of(new Long[] { 1L }, new Long[] { 1L }),
            Arguments.of(new Long[] { 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L }, new Long[] { 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L }),
            Arguments.of(new Long[] { 9L, 8L, 7L, 6L, 5L, 4L, 3L, 2L, 1L }, new Long[] { 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L }),
            Arguments.of(new Long[] { Long.MAX_VALUE, 0L, Long.MIN_VALUE }, new Long[] { Long.MIN_VALUE, 0L, Long.MAX_VALUE }),
            Arguments.of(new Long[] { 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L }, new Long[] { 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L }),
            Arguments.of(new Long[] { -1L, -2L, -3L, -4L, -5L, -6L, -7L, -8L, -9L }, new Long[] { -9L, -8L, -7L, -6L, -5L, -4L, -3L, -2L, -1L })
        );
    }

    private static Stream<Arguments> getFloatArrays() {
        return Stream.of(
            Arguments.of(new Float[] { 3.0f, 1.0f, 4.0f, 1.0f, 5.0f, 9.0f, 2.0f, 6.0f, 5.0f }, new Float[] { 1.0f, 1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 5.0f, 6.0f, 9.0f }),
            Arguments.of(new Float[] { }, new Float[] { }),
            Arguments.of(new Float[] { 1.0f }, new Float[] { 1.0f }),
            Arguments.of(new Float[] { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f }, new Float[] { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f }),
            Arguments.of(new Float[] { 9.0f, 8.0f, 7.0f, 6.0f, 5.0f, 4.0f, 3.0f, 2.0f, 1.0f }, new Float[] { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f }),
            Arguments.of(new Float[] { Float.MAX_VALUE, 0.0f, -Float.MAX_VALUE }, new Float[] { -Float.MAX_VALUE, 0.0f, Float.MAX_VALUE }),
            Arguments.of(new Float[] { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f }, new Float[] { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f }),
            Arguments.of(new Float[] { -1.0f, -2.0f, -3.0f, -4.0f, -5.0f, -6.0f, -7.0f, -8.0f, -9.0f }, new Float[] { -9.0f, -8.0f, -7.0f, -6.0f, -5.0f, -4.0f, -3.0f, -2.0f, -1.0f })
        );
    }

    private static Stream<Arguments> getBooleanArrays() {
        return Stream.of(
            Arguments.of(new Boolean[] { true, false, true, false, true, false, true, false, true }, new Boolean[] { false, false, false, false, true, true, true, true, true }),
            Arguments.of(new Boolean[] { }, new Boolean[] { }),
            Arguments.of(new Boolean[] { true }, new Boolean[] { true }),
            Arguments.of(new Boolean[] { true, true, true, true, true, true, true, true, true }, new Boolean[] { true, true, true, true, true, true, true, true, true }),
            Arguments.of(new Boolean[] { false, false, false, false, false, false, false, false, false }, new Boolean[] { false, false, false, false, false, false, false, false, false })
        );
    }

    private static Stream<Arguments> getCharacterArrays() {
        return Stream.of(
            Arguments.of(new Character[] { 'c', 'a', 'd', 'a', 'e', 'i', 'b', 'f', 'e' }, new Character[] { 'a', 'a', 'b', 'c', 'd', 'e', 'e', 'f', 'i' }),
            Arguments.of(new Character[] { }, new Character[] { }),
            Arguments.of(new Character[] { 'a' }, new Character[] { 'a' }),
            Arguments.of(new Character[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' }, new Character[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' }),
            Arguments.of(new Character[] { 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a' }, new Character[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' }),
            Arguments.of(new Character[] { Character.MAX_VALUE, 'a', Character.MIN_VALUE }, new Character[] { Character.MIN_VALUE, 'a', Character.MAX_VALUE }),
            Arguments.of(new Character[] { 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a' }, new Character[] { 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a' }),
            Arguments.of(new Character[] { 'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r' }, new Character[] { 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' })
        );
    }

    private static Stream<Arguments> getStringArrays() {
        return Stream.of(
            Arguments.of(new String[] { "c", "a", "d", "a", "e", "i", "b", "f", "e" }, new String[] { "a", "a", "b", "c", "d", "e", "e", "f", "i" }),
            Arguments.of(new String[] { }, new String[] { }),
            Arguments.of(new String[] { "a" }, new String[] { "a" }),
            Arguments.of(new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i" }, new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i" }),
            Arguments.of(new String[] { "i", "h", "g", "f", "e", "d", "c", "b", "a" }, new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i" }),
            Arguments.of(new String[] { "a", "a", "a", "a", "a", "a", "a", "a", "a" }, new String[] { "a", "a", "a", "a", "a", "a", "a", "a", "a" }),
            Arguments.of(new String[] { "z", "y", "x", "w", "v", "u", "t", "s", "r" }, new String[] { "r", "s", "t", "u", "v", "w", "x", "y", "z" })
        );
    }

    @ParameterizedTest(name = "{index}: Sorting {0} -> Expected {1}")
    @MethodSource({ "getIntegerArrays", "getDoubleArrays", "getByteArrays", "getShortArray", "getLongArrays", "getFloatArrays", "getBooleanArrays", "getCharacterArrays", "getStringArrays" })
    public <T extends Comparable<T>> void shouldSortArray(T[] unsortedArray, T[] expectedSortedArray) {
        assertArrayEquals(expectedSortedArray, getSortingAlgorithm().sort(unsortedArray));
    }

}
