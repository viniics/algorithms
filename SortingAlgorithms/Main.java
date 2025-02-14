package SortingAlgorithms;

import SortingAlgorithms.DivideAndConquer.MergeSort;
import SortingAlgorithms.Quadratic.BubbleSorter;
import SortingAlgorithms.Quadratic.InsertionSorter;
import SortingAlgorithms.Quadratic.SelectorSorter;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Algorithm algorithm =  new MergeSort();
        int[] array = {4,41,0,28,27,99,9,8,7,6,5,4,3,2,1};
        algorithm.sort(array);
        for(int i: array){
            System.out.print(i+ " ");
        }
    }
}
