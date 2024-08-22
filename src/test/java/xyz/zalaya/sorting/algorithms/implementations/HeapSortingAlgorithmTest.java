package xyz.zalaya.sorting.algorithms.implementations;

import xyz.zalaya.sorting.algorithms.SortingAlgorithm;
import xyz.zalaya.sorting.algorithms.SortingAlgorithmTest;

public class HeapSortingAlgorithmTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new HeapSortingAlgorithm();
    }

}
