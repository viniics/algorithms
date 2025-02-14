package SortingAlgorithms.DivideAndConquer;

import SortingAlgorithms.Algorithm;

public class MergeSort extends Algorithm {

    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    public void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int mid = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, mid);
            mergeSort(array, mid + 1, rightIndex);
            merge(array, leftIndex, mid, rightIndex);
        }
    }

    public void merge(int[] array, int leftIndex, int mid, int rightIndex) {
        int sizeArray1 = mid - leftIndex+1;
        int sizeArray2 = rightIndex - mid;

        int[] array1 = new int[sizeArray1];
        int[] array2 = new int[sizeArray2];

        for (int i = 0; i < sizeArray1; i++) {
            //Aqui o bug
            array1[i] = array[leftIndex+i];
        }
        for (int i = 0; i < sizeArray2; i++) {
            array2[i] = array[mid + 1 + i];
        }

        int c1 = 0;
        int c2 = 0;
        int k = leftIndex;
        while (c1 < sizeArray1 && c2 < sizeArray2) {
            if (array1[c1] <= array2[c2]) {
                array[k] = array1[c1];
                c1++;
            } else {
                array[k] = array2[c2];
                c2++;
            }
            k++;
        }

        while (c1 < sizeArray1) {
            array[k] = array1[c1];
            c1++;
            k++;
        }

        while (c2 < sizeArray2) {
            array[k] = array2[c2];
            c2++;
            k++;
        }

    }
}
