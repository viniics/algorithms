// Link: https://leetcode.com/problems/roman-to-integer/
package leetcode;

public class Questao13 {
    public int romanToInt(String s){
        char[] charArr = s.toCharArray();
        int result = 0;
        for (int i = 0; i<charArr.length-1;i++){
            if(convert(charArr[i])<convert(charArr[i+1])){
                result += convert(charArr[i+1])-convert(charArr[i]);
            }
            else{
                result += convert(charArr[i]);
            }
        }
        result+= convert(charArr[charArr.length-1]);

        return result;
    }


    public int convert(char c){
        Character upper = Character.toUpperCase(c);
        switch (upper) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return c;
    }


    void main(){
        System.out.println(romanToInt("III"));
    }
}
