// Link: https://leetcode.com/problems/longest-common-prefix
package leetcode;

public class Questao14 {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i = 0; i < getMaxRange(strs); i++) {
            char currentChar = strs[0].charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != currentChar) {
                    return prefix;
                }
            }
            prefix += currentChar;
        }

        return prefix;
    }

    int getMaxRange(String[] strs) {
        if (strs.length == 0)
            return 0;
        int minLength = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            int currentLength = strs[i].length();
            if (currentLength < minLength) {
                minLength = currentLength;
            }
        }
        return minLength;
    }

}
