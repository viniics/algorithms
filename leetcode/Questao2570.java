// Link: https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values
package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Questao2570 {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> finalList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i<nums1.length && j<nums2.length) {
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
        }

            // Logica do mergeSort, apenas insere os elementos do array restante

            while(i<nums1.length){
                finalList.add(nums1[i]);
                i++;
            }

            while (j<nums2.length) {
                finalList.add(nums2[j]);
                j++;
            }

        int[][] finalArray = new int[finalList.size()][];
        for (int h =0;h<finalList.size();h++){
            finalArray[h] = finalList.get(h);
        }
        return finalArray;
    }

    private static int getArrId(int[][] arr1,int i){
        return arr1[i][0];
    }
    
    public static void main(String[] args){
        int[][] array = {{1,2},{2,3},{4,5}};
        int[][] array2 = {{1,4},{3,2},{4,1}};
        int[][] arrayFinal = mergeArrays(array, array2);
        for(int[] c:arrayFinal){
            System.out.println(c[0]+" "+ c[1]);
        }
        }
    }