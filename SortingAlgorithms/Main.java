package SortingAlgorithms;

import SortingAlgorithms.Quadratic.BubbleSorter;
import SortingAlgorithms.Quadratic.InsertionSorter;
import SortingAlgorithms.Quadratic.SelectorSorter;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Algorithm algorithm =  new InsertionSorter();
        int[] array = {1,3,95,1,9,4,6,0};
        algorithm.sort(array);
        for(int i: array){
            System.out.print(i+ " ");
        }
    }
}
