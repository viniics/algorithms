package SortingAlgorithms.Quadratic;

import SortingAlgorithms.Algorithm;

public class BubbleSorter extends Algorithm {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    utils.swap(array, i, j);
                }
            }
        }
    }

}
