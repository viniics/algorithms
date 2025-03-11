import SortingAlgorithms.Algorithm;

public class CountingSort extends Algorithm {
    @Override
    public void sort(int[] array){
        int maxValue = Math.max(array);
        int[] novoArray = new int[maxValue];
        // Preenche o array auxiliar
        for (int i = 0; i < array.length;i++){
            int value = array[i];
            novoArray[value] ++;
        }
        int c = 0;
        for(int i = 0;i<novoArray.length;i++){
            while (novoArray[i]>0) {
                array[c] = i;
                c++;
            }
        }
    }
}
