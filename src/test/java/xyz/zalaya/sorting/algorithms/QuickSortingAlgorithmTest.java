package xyz.zalaya.sorting.algorithms;

import xyz.zalaya.sorting.contracts.SortingAlgorithm;
import xyz.zalaya.sorting.contracts.SortingAlgorithmTest;

/**
 * Test class for the quick sorting algorithm.
 * It extends the {@link SortingAlgorithmTest} class.
 */
public class QuickSortingAlgorithmTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new QuickSortingAlgorithm();
    }

}
