package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;
import xyz.zalaya.sorting.algorithms.SortingAlgorithmTest;

/**
 * Test class for the insertion sorting algorithm.
 * It extends the {@link SortingAlgorithmTest} class.
 */
public class InsertionSortingAlgorithmTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new InsertionSortingAlgorithm();
    }

}