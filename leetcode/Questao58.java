// Link: https://leetcode.com/problems/length-of-last-word/ 
package leetcode;

class Questao58{
    // Complexity: O(N)
    public int lengthOfLastWord(String s) {
            int i = s.length()-1;
            int lastWordLen = 0;
            // Loop que ignora todos os espacos vazios no final da String
            while (s.charAt(i) == ' ') {
                i--;
            }
            // Conta os caracteres ate o proximo espaco vazio ou ate o final da String
            while (i>=0 && s.charAt(i)!= ' ') {
                i--;
                lastWordLen ++;
            }
            return lastWordLen;
        }
        
        // Testes disponveis pelo leetcode
        void main(String[] args) {
            System.out.println(lengthOfLastWord("Hello World"));
            System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
            System.out.println(lengthOfLastWord("luffy is still joyboy"));
            System.out.println(lengthOfLastWord("a"));
    }
}