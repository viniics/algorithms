// Link: https://leetcode.com/problems/palindrome-number
package leetcode;

public class Questao9 {
    // Primeiro, faremos transformando em String
    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
    
    char[] intToCharArr = String.valueOf(x).toCharArray();
    int i = 0;
    int j = intToCharArr.length-1;
    while (i<j) {
        if(intToCharArr[i]!=intToCharArr[j]){
            return false;
        }
        i++;
        j--;
    }
    return true;
    }
}
