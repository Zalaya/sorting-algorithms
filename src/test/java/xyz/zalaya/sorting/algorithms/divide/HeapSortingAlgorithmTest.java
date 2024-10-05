package xyz.zalaya.sorting.algorithms.divide;

import xyz.zalaya.sorting.core.SortingAlgorithm;
import xyz.zalaya.sorting.core.SortingAlgorithmTest;

public class HeapSortingAlgorithmTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new HeapSortingAlgorithm();
    }

}
