// Link: https://leetcode.com/problems/plus-one/description/

package leetcode;

public class Questao66 {
    public static int[] plusOne(int[] digits) {
        int[] returnArray = new int[digits.length + 1];
        int toAdd = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if ((digits[i] == 9 && toAdd == 1)) {
                returnArray[i] = 0;
            } else {
                returnArray[i] = digits[i] + toAdd;
                toAdd = 0;
            }
        }
        if (toAdd == 1) {
            returnArray[0] = 1;
        }
        // se nao tinha que adicionar, entao nao aumentou a quantidade de digitos.
        else {
            for (int i = 0; i < returnArray.length - 1; i++) {
                digits[i] = returnArray[i];

            }
            return digits;
        }
        return returnArray;
    }

    public static void main(String[] args) {
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] array2 = { 9, 2 };

        for (int i : plusOne(array2)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : plusOne(array)) {
            System.out.print(i + " ");
        }
    }
}
