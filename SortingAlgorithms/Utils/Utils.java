package SortingAlgorithms.Utils;

public class Utils {

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int myMax(int[] array){
        if (array.length<1) throw new ArrayIndexOutOfBoundsException("Array vazio!");
        int maxVal = array[0];
        for(int i = 1; i<array.length; i++){
            if (array[i]>maxVal) {
                maxVal = array[i];
            }
        }
        return maxVal;
    }
}
