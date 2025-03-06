//  Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
package leetcode;

public class Questao28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() >= haystack.length()) return -1;

        for (int i = 0; i < haystack.length(); i++) {
            // Como uma otimização ao algorítmo de força bruta,
            if (haystack.charAt(i)== needle.charAt(0)) {
                int isValid = 0;
                for(int j = 0;j<needle.length();j++){
                    if(haystack.charAt(i+j)==needle.charAt(j)){
                        isValid++;
                    }
                }
                if (isValid==needle.length()) return i;
            }
        }

        return -1;
    }

    void main() {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
    }
}
