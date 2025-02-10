package SortingAlgorithms;

import SortingAlgorithms.Quadratic.BubbleSorter;
import SortingAlgorithms.Quadratic.InsertionSorter;
import SortingAlgorithms.Quadratic.SelectorSorter;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Algorithm algorithm =  new InsertionSorter();
        int[] array = {1,2,3,4,5,6,7,8,9};
        algorithm.sort(array);
        for(int i: array){
            System.out.print(i+ " ");
        }
    }
}
