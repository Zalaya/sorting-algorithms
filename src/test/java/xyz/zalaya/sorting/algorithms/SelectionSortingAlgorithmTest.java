package xyz.zalaya.sorting.algorithms;

import xyz.zalaya.sorting.core.SortingAlgorithm;
import xyz.zalaya.sorting.core.SortingAlgorithmTest;

public class SelectionSortingAlgorithmTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new SelectionSortingAlgorithm();
    }

}
