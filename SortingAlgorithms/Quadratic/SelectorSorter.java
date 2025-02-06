package SortingAlgorithms.Quadratic;

import SortingAlgorithms.Algorithm;

public class SelectorSorter extends Algorithm {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lowestValue = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[lowestValue] > array[j]) {
                    lowestValue = j;
                }
            }
            swap.swap(array, i, lowestValue);
        }
    }
}
