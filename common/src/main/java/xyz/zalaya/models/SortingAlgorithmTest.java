package xyz.zalaya.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public abstract class SortingAlgorithmTest {

    public abstract SortingAlgorithm getSortingAlgorithm();

    @Test
    public void shouldSortIntegerArray() {
        Integer[] array = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
        Integer[] expectedArray = { 1, 1, 2, 3, 3, 4, 5, 5, 6, 9 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortDoubleArray() {
        Double[] array = { 3.0, 1.0, 4.0, 1.0, 5.0, 9.0, 2.0, 6.0, 5.0, 3.0 };
        Double[] expectedArray = { 1.0, 1.0, 2.0, 3.0, 3.0, 4.0, 5.0, 5.0, 6.0, 9.0 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortByteArray() {
        Byte[] array = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
        Byte[] expectedArray = { 1, 1, 2, 3, 3, 4, 5, 5, 6, 9 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortShortArray() {
        Short[] array = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
        Short[] expectedArray = { 1, 1, 2, 3, 3, 4, 5, 5, 6, 9 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortLongArray() {
        Long[] array = { 3L, 1L, 4L, 1L, 5L, 9L, 2L, 6L, 5L, 3L };
        Long[] expectedArray = { 1L, 1L, 2L, 3L, 3L, 4L, 5L, 5L, 6L, 9L };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortFloatArray() {
        Float[] array = { 3.0f, 1.0f, 4.0f, 1.0f, 5.0f, 9.0f, 2.0f, 6.0f, 5.0f, 3.0f };
        Float[] expectedArray = { 1.0f, 1.0f, 2.0f, 3.0f, 3.0f, 4.0f, 5.0f, 5.0f, 6.0f, 9.0f };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortCharacterArray() {
        Character[] array = { 'c', 'a', 'd', 'a', 'e', 'i', 'b', 'f', 'e', 'c' };
        Character[] expectedArray = { 'a', 'a', 'b', 'c', 'c', 'd', 'e', 'e', 'f', 'i' };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortBooleanArray() {
        Boolean[] array = { true, false, true, false, true, false, true, false, true, false };
        Boolean[] expectedArray = { false, false, false, false, false, true, true, true, true, true };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortStringArray() {
        String[] array = { "c", "a", "d", "a", "e", "i", "b", "f", "e", "c" };
        String[] expectedArray = { "a", "a", "b", "c", "c", "d", "e", "e", "f", "i" };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortIntegerEmptyArray() {
        Integer[] array = { };
        Integer[] expectedArray = { };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortDoubleEmptyArray() {
        Double[] array = { };
        Double[] expectedArray = { };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortByteEmptyArray() {
        Byte[] array = { };
        Byte[] expectedArray = { };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortShortEmptyArray() {
        Short[] array = { };
        Short[] expectedArray = { };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortLongEmptyArray() {
        Long[] array = { };
        Long[] expectedArray = { };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortFloatEmptyArray() {
        Float[] array = { };
        Float[] expectedArray = { };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortCharacterEmptyArray() {
        Character[] array = { };
        Character[] expectedArray = { };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortBooleanEmptyArray() {
        Boolean[] array = { };
        Boolean[] expectedArray = { };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortStringEmptyArray() {
        String[] array = { };
        String[] expectedArray = { };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortIntegerArrayWithOneElement() {
        Integer[] array = { 1 };
        Integer[] expectedArray = { 1 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortDoubleArrayWithOneElement() {
        Double[] array = { 1.0 };
        Double[] expectedArray = { 1.0 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortByteArrayWithOneElement() {
        Byte[] array = { 1 };
        Byte[] expectedArray = { 1 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortShortArrayWithOneElement() {
        Short[] array = { 1 };
        Short[] expectedArray = { 1 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortLongArrayWithOneElement() {
        Long[] array = { 1L };
        Long[] expectedArray = { 1L };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortFloatArrayWithOneElement() {
        Float[] array = { 1.0f };
        Float[] expectedArray = { 1.0f };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortCharacterArrayWithOneElement() {
        Character[] array = { 'a' };
        Character[] expectedArray = { 'a' };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortBooleanArrayWithOneElement() {
        Boolean[] array = { true };
        Boolean[] expectedArray = { true };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortStringArrayWithOneElement() {
        String[] array = { "a" };
        String[] expectedArray = { "a" };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortIntegerArrayWithEdgeElements() {
        Integer[] array = { Integer.MAX_VALUE, Integer.MIN_VALUE, 0 };
        Integer[] expectedArray = { Integer.MIN_VALUE, 0, Integer.MAX_VALUE };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortDoubleArrayWithEdgeElements() {
        Double[] array = { Double.MAX_VALUE, -Double.MAX_VALUE, 0.0 };
        Double[] expectedArray = { -Double.MAX_VALUE, 0.0, Double.MAX_VALUE };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortByteArrayWithEdgeElements() {
        Byte[] array = { Byte.MAX_VALUE, Byte.MIN_VALUE, 0 };
        Byte[] expectedArray = { Byte.MIN_VALUE, 0, Byte.MAX_VALUE };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortShortArrayWithEdgeElements() {
        Short[] array = { Short.MAX_VALUE, Short.MIN_VALUE, 0 };
        Short[] expectedArray = { Short.MIN_VALUE, 0, Short.MAX_VALUE };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortLongArrayWithEdgeElements() {
        Long[] array = { Long.MAX_VALUE, Long.MIN_VALUE, 0L };
        Long[] expectedArray = { Long.MIN_VALUE, 0L, Long.MAX_VALUE };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortFloatArrayWithEdgeElements() {
        Float[] array = { Float.MAX_VALUE, -Float.MAX_VALUE, 0.0f };
        Float[] expectedArray = { -Float.MAX_VALUE, 0.0f, Float.MAX_VALUE };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortCharacterArrayWithEdgeElements() {
        Character[] array = { Character.MAX_VALUE, -Character.MIN_VALUE, 'a' };
        Character[] expectedArray = { Character.MIN_VALUE, 'a', Character.MAX_VALUE };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortBooleanArrayWithEdgeElements() {
        Boolean[] array = { true, false };
        Boolean[] expectedArray = { false, true };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortStringArrayWithEdgeElements() {
        String[] array = { "zzz", "aaa", "bbb" };
        String[] expectedArray = { "aaa", "bbb", "zzz" };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortIntegerArrayWithRepeatedElements() {
        Integer[] array = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
        Integer[] expectedArray = { 1, 1, 2, 3, 3, 4, 5, 5, 6, 9 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortDoubleArrayWithRepeatedElements() {
        Double[] array = { 3.0, 1.0, 4.0, 1.0, 5.0, 9.0, 2.0, 6.0, 5.0, 3.0 };
        Double[] expectedArray = { 1.0, 1.0, 2.0, 3.0, 3.0, 4.0, 5.0, 5.0, 6.0, 9.0 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortByteArrayWithRepeatedElements() {
        Byte[] array = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
        Byte[] expectedArray = { 1, 1, 2, 3, 3, 4, 5, 5, 6, 9 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortShortArrayWithRepeatedElements() {
        Short[] array = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
        Short[] expectedArray = { 1, 1, 2, 3, 3, 4, 5, 5, 6, 9 };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortLongArrayWithRepeatedElements() {
        Long[] array = { 3L, 1L, 4L, 1L, 5L, 9L, 2L, 6L, 5L, 3L };
        Long[] expectedArray = { 1L, 1L, 2L, 3L, 3L, 4L, 5L, 5L, 6L, 9L };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortFloatArrayWithRepeatedElements() {
        Float[] array = { 3.0f, 1.0f, 4.0f, 1.0f, 5.0f, 9.0f, 2.0f, 6.0f, 5.0f, 3.0f };
        Float[] expectedArray = { 1.0f, 1.0f, 2.0f, 3.0f, 3.0f, 4.0f, 5.0f, 5.0f, 6.0f, 9.0f };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortCharacterArrayWithRepeatedElements() {
        Character[] array = { 'c', 'a', 'd', 'a', 'e', 'i', 'b', 'f', 'e', 'c' };
        Character[] expectedArray = { 'a', 'a', 'b', 'c', 'c', 'd', 'e', 'e', 'f', 'i' };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortBooleanArrayWithRepeatedElements() {
        Boolean[] array = { true, false, true, false, true, false, true, false, true, false };
        Boolean[] expectedArray = { false, false, false, false, false, true, true, true, true, true };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void shouldSortStringArrayWithRepeatedElements() {
        String[] array = { "c", "a", "d", "a", "e", "i", "b", "f", "e", "c" };
        String[] expectedArray = { "a", "a", "b", "c", "c", "d", "e", "e", "f", "i" };

        getSortingAlgorithm().sort(array);

        assertArrayEquals(expectedArray, array);
    }

}
