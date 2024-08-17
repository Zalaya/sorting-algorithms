package xyz.zalaya;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SorterTest {

    private Sorter sorter;

    @BeforeEach
    void setUp() {
        sorter = new Sorter();
    }

    @Test
    void shouldSortUnsortedArray() {
        // Given
        int[] unsortedArray = { 64, 25, 12, 22, 11 };
        int[] expectedArray = { 11, 12, 22, 25, 64 };

        // When
        sorter.sort(unsortedArray);

        // Then
        assertArrayEquals(expectedArray, unsortedArray);
    }

    @Test
    void shouldSortSortedArray() {
        // Given
        int[] sortedArray = { 11, 12, 22, 25, 64 };
        int[] expectedArray = { 11, 12, 22, 25, 64 };

        // When
        sorter.sort(sortedArray);

        // Then
        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    void shouldSortSingleElementArray() {
        // Given
        int[] singleElementArray = { 11 };
        int[] expectedArray = { 11 };

        // When
        sorter.sort(singleElementArray);

        // Then
        assertArrayEquals(expectedArray, singleElementArray);
    }

    @Test
    void shouldSortEmptyArray() {
        // Given
        int[] emptyArray = {};
        int[] expectedArray = {};

        // When
        sorter.sort(emptyArray);

        // Then
        assertArrayEquals(expectedArray, emptyArray);
    }

    @Test
    void shouldSortArrayWithNegativeNumbers() {
        // Given
        int[] arrayWithNegativeNumbers = { -11, 12, -22, 25, 64 };
        int[] expectedArray = { -22, -11, 12, 25, 64 };

        // When
        sorter.sort(arrayWithNegativeNumbers);

        // Then
        assertArrayEquals(expectedArray, arrayWithNegativeNumbers);
    }

    @Test
    void shouldSortArrayWithDuplicates() {
        // Given
        int[] arrayWithDuplicates = { 11, 12, 22, 25, 11 };
        int[] expectedArray = { 11, 11, 12, 22, 25 };

        // When
        sorter.sort(arrayWithDuplicates);

        // Then
        assertArrayEquals(expectedArray, arrayWithDuplicates);
    }

    @Test
    void shouldSortArrayWithAllEqualElements() {
        // Given
        int[] arrayWithAllEqualElements = { 11, 11, 11, 11, 11 };
        int[] expectedArray = { 11, 11, 11, 11, 11 };

        // When
        sorter.sort(arrayWithAllEqualElements);

        // Then
        assertArrayEquals(expectedArray, arrayWithAllEqualElements);
    }

    @Test
    void shouldSortArrayWithAllEqualNegativeElements() {
        // Given
        int[] arrayWithAllEqualNegativeElements = { -11, -11, -11, -11, -11 };
        int[] expectedArray = { -11, -11, -11, -11, -11 };

        // When
        sorter.sort(arrayWithAllEqualNegativeElements);

        // Then
        assertArrayEquals(expectedArray, arrayWithAllEqualNegativeElements);
    }

    @Test
    void shouldSortArrayWithAllEqualZeroElements() {
        // Given
        int[] arrayWithAllEqualZeroElements = { 0, 0, 0, 0, 0 };
        int[] expectedArray = { 0, 0, 0, 0, 0 };

        // When
        sorter.sort(arrayWithAllEqualZeroElements);

        // Then
        assertArrayEquals(expectedArray, arrayWithAllEqualZeroElements);
    }

    @Test
    void shouldSortArrayWithMaxInt() {
        // Given
        int[] arrayWithMaxInt = { Integer.MAX_VALUE, 0, 0, 0, 0 };
        int[] expectedArray = { 0, 0, 0, 0, Integer.MAX_VALUE };

        // When
        sorter.sort(arrayWithMaxInt);

        // Then
        assertArrayEquals(expectedArray, arrayWithMaxInt);
    }

    @Test
    void shouldSortArrayWithMinInt() {
        // Given
        int[] arrayWithMinInt = { Integer.MIN_VALUE, 0, 0, 0, 0 };
        int[] expectedArray = { Integer.MIN_VALUE, 0, 0, 0, 0 };

        // When
        sorter.sort(arrayWithMinInt);

        // Then
        assertArrayEquals(expectedArray, arrayWithMinInt);
    }

    @Test
    void shouldSortArrayWithMaxIntAndMinInt() {
        // Given
        int[] arrayWithMaxIntAndMinInt = { Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 0, 0 };
        int[] expectedArray = { Integer.MIN_VALUE, 0, 0, 0, Integer.MAX_VALUE };

        // When
        sorter.sort(arrayWithMaxIntAndMinInt);

        // Then
        assertArrayEquals(expectedArray, arrayWithMaxIntAndMinInt);
    }

}
