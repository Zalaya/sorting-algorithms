package xyz.zalaya;

import xyz.zalaya.models.SortingAlgorithm;
import xyz.zalaya.models.SortingAlgorithmTest;

public class InsertionSortTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new InsertionSort();
    }

}
