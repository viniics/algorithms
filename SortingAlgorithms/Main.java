package SortingAlgorithms;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm =  new BubbleSorter();
        int[] array = {9,8,7,6,5,4,3,2};
        algorithm.sort(array);

        for(int i: array){
            System.out.print(i+ " ");
        }
    }
}
