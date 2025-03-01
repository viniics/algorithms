package leetcode;

public class Questão20 {
        public static boolean isValid(String s) {
            int openBrackets = 0;
            int openParentheses = 0;
            int openBraces = 0;
            for (char c: s.toCharArray()){
                switch (c) {
                    case '{':
                        openBraces++;
                        break;
                    case '(':
                        openParentheses++;
                        break;
                    case '[':
                        openBrackets++;
                        break;                
                    default:
                        break;
                }
            }

            for (char c: s.toCharArray()){
                switch (c) {
                    case '}':
                        openBraces--;
                        break;
                    case ')':
                        openParentheses--;
                        break;
                    case ']':
                        openBrackets--;
                        break;                
                    default:
                        break;
                }
            }

            return openBraces==openBrackets && openParentheses==0 && openBraces==openParentheses;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}
