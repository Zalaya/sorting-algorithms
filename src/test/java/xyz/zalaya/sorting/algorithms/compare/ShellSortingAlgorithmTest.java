package xyz.zalaya.sorting.algorithms.compare;

import xyz.zalaya.sorting.core.SortingAlgorithm;
import xyz.zalaya.sorting.core.SortingAlgorithmTest;

public class ShellSortingAlgorithmTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new ShellSortingAlgorithm();
    }

}
