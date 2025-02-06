package SortingAlgorithms;

import SortingAlgorithms.Utils.Swap;

public class BubbleSorter implements Algorithm {

    public Swap swap = new Swap();

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap.swap(array, i, j);
                }
            }
        }
    }

}
