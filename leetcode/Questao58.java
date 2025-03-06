// Link: https://leetcode.com/problems/length-of-last-word/ 
package leetcode;
class Questao58{
    // Isso ainda nao cobre os casos que há espaços vazios no final
    public static int lengthOfLastWord(String s) {
            int i = s.length()-1;
            // boolean isValid = false;
            while (s.charAt(i)!=' ') {
                i--;
            }
            return s.length()-1-i;
        }
    
        public static void main(String[] args) {
            System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}