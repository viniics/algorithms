package SortingAlgorithms.Quadratic;

import SortingAlgorithms.Algorithm;

public class InsertionSorter extends Algorithm{
    // Definição (src: medium.com)

    // Insertion Sort begins by looking at the second value in the array, and
    // compares it to the value before it. If the value before it is bigger, you
    // copy the value and place it one spot to the right. You repeat this process
    // until you either reach the beginning of the array or the value in question is
    // not bigger. You then set the index you finished at with the current value you
    // where testing.

    @Override
    public void sort(int[] array){
        for(int i = 0; i<array.length-1;i++){
            while (array[i]<array[i+1] && i>=1) {
                swap.swap(array, i, i+1);
            }
        }
    }
}
