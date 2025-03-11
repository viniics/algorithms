package leetcode;

public class Questao70 {
    public int climbStairs(int n){
        if(n==0) return n;
        if(n-2>=0) return 1 + climbStairs(n-2) + climbStairs(n-1);
        else return 1 + climbStairs(n-1); 
    }

    void main(){
        System.out.println(climbStairs(3));
    }
}
