// Link: https://leetcode.com/problems/powx-n/
package leetcode;

public class Questao50 {
    public double myPow(double x, int n) {
        
        if(n==0){
            return 1;
        }
        return x*myPow(x, n-1);   
    }
}
