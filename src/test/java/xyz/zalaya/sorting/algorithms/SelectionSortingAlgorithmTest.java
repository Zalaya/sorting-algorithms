package xyz.zalaya.sorting.algorithms;

import xyz.zalaya.sorting.contracts.SortingAlgorithm;
import xyz.zalaya.sorting.contracts.SortingAlgorithmTest;

/**
 * Test class for the selection sorting algorithm.
 * It extends the {@link SortingAlgorithmTest} class.
 */
public class SelectionSortingAlgorithmTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new SelectionSortingAlgorithm();
    }

}
