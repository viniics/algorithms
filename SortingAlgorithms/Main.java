package SortingAlgorithms;

import SortingAlgorithms.Quadratic.BubbleSorter;
import SortingAlgorithms.Quadratic.SelectorSorter;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Algorithm algorithm =  new SelectorSorter();
        int[] array = {9,8,7,6,5,4,3,2};
        algorithm.sort(array);
        for(int i: array){
            System.out.print(i+ " ");
        }
    }
}
