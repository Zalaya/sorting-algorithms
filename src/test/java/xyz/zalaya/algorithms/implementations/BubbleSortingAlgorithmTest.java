package xyz.zalaya.algorithms.implementations;

import xyz.zalaya.algorithms.SortingAlgorithm;
import xyz.zalaya.algorithms.SortingAlgorithmTest;

public class BubbleSortingAlgorithmTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new BubbleSortingAlgorithm();
    }

}
