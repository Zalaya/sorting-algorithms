package xyz.zalaya.algorithms.implementations;

import xyz.zalaya.algorithms.SortingAlgorithm;
import xyz.zalaya.algorithms.SortingAlgorithmTest;

public class SelectionSortingAlgorithmTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new SelectionSortingAlgorithm();
    }

}
