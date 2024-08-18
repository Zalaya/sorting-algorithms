package xyz.zalaya;

import xyz.zalaya.models.SortingAlgorithm;
import xyz.zalaya.models.SortingAlgorithmTest;

public class SelectionSortTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new SelectionSort();
    }

}
