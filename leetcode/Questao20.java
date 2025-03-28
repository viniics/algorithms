// Link: https://leetcode.com/problems/valid-parentheses/

package leetcode;

import java.util.Stack;

public class Questao20 {
    
    public boolean isValid(String s){
        Stack<Character> pilha = new Stack<Character>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                    pilha.add(c);
                    break;
                case '(':
                    pilha.add(c);
                    break;
                case '[':
                pilha.add(c);
                break;
                case '}':
                    if (pilha.isEmpty() || pilha.pop() != '{') return false;
                    break;
                case ')':
                    if (pilha.isEmpty() || pilha.pop() != '(') return false;
                    break;
                case ']':
                    if (pilha.isEmpty() ||pilha.pop() != '[') return false;
                    break;
                default:
                    break;
            }
        }
        return pilha.isEmpty();
    }
}
