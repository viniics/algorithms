// Link: https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/?envType=daily-question&envId=2025-03-02

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Questao2570 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> finalList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i<nums1.length || j<nums2.length) {
            if(getArrId(nums1, i)==getArrId(nums2, j)){
                int novoId = getArrId(nums1, i);
                int novoNum = 0;
                novoNum+= nums1[i][1] + nums2[j][1];
                int[] toAdd = {novoId,novoNum};
                finalList.add(toAdd);
                i++;
                j++;
            }
            else if (getArrId(nums1, i)<getArrId(nums2, j)){
                finalList.add(nums1[i]);
                i++;
            }
            else{
                finalList.add(nums2[j]);
                j++;
            }

            // Logica parecida com algortimo mergeSort de apenas inserir os elementos finais

            while(i<nums1.length){
                finalList.add(nums1[i]);
                i++;
            }

            while (j<nums2.length) {
                finalList.add(nums2[j]);
                j++;
            }
        }
        return (int[][]) finalList.toArray();
    }

    private int getArrId(int[][] arr1,int i){
        return arr1[i][0];
    }


}
