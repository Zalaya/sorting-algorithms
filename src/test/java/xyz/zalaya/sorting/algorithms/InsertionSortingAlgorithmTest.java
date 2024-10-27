package xyz.zalaya.sorting.algorithms;

import xyz.zalaya.sorting.contracts.SortingAlgorithm;
import xyz.zalaya.sorting.contracts.SortingAlgorithmTest;

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