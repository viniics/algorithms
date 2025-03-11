package SortingAlgorithms.Other;

import SortingAlgorithms.Algorithm;

public class CountingSort extends Algorithm {
    @Override
    public void sort(int[] array){
        int maxValue = utils.myMax(array);
        int[] auxArray = new int[maxValue+1];
        // Preenche o array auxiliar
        for (int i = 0; i < array.length;i++){
            int value = array[i];
            auxArray[value] ++;
        }
        
        int c = 0;
        
        for(int i = 1;i<=auxArray.length;i++){
            while (auxArray[i-1]>0) {
                auxArray[i-1] --;
                array[c] = i-1;
                c++;
            }
        }
    }
}
