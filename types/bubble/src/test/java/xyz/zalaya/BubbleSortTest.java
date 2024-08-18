package xyz.zalaya;

import xyz.zalaya.models.SortingAlgorithm;
import xyz.zalaya.models.SortingAlgorithmTest;

public class BubbleSortTest extends SortingAlgorithmTest {

    @Override
    public SortingAlgorithm getSortingAlgorithm() {
        return new BubbleSort();
    }

}
