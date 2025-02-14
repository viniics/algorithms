package SortingAlgorithms.DivideAndConquer;

import SortingAlgorithms.Algorithm;

public class MergeSort extends Algorithm {

    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    // O MergeSort separa o array em subarrays ate que se chegue num array de tamanho 1
    // Onde "LeftIndex" seria igual a "RightIndex".
    // Depois de dividir o array n vezes, ele começa o processo de reordenação pelo metodo merge
    public void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int mid = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, mid);
            mergeSort(array, mid + 1, rightIndex);
            merge(array, leftIndex, mid, rightIndex);
        }
    }

    public void merge(int[] array, int leftIndex, int mid, int rightIndex) {
        // Cria dois subarrays auxiliares.
        int sizeArray1 = mid - leftIndex + 1;
        int sizeArray2 = rightIndex - mid;
        int[] array1 = new int[sizeArray1];
        int[] array2 = new int[sizeArray2];

        // Preenche os subarrays com os elementos do array original
        for (int i = 0; i < sizeArray1; i++) {
            array1[i] = array[leftIndex + i];
        }
        for (int i = 0; i < sizeArray2; i++) {
            array2[i] = array[mid + 1 + i];
        }

        // C1 e C2 equivalem a apontadores que vao comparar os elementos de cada array.
        // C1 itera pelos elementos do array1 e c2 itera pelos elementos do array2
        // K eh um apontador que faz referencia a posicao absoluta do array (ou subarray) original
        int c1 = 0;
        int c2 = 0;
        int k = leftIndex;
        // Aqui, enquanto houverem elementos em ambos array1 e array2, será feita a
        // comparação elemento a elemento
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

        // Quando algum dos arrays esvaziar, o outro entra em algum desses whiles
        // completando o restante da ordenacao.
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
