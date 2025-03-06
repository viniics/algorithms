//  Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
package leetcode;

public class Questao28 {
    public int strStr(String haystack, String needle) {
        // Nao tem como uma palavra maior que o texto total estar presente no texto!
        // Esse trecho de codigo nao eh obrigatorio, eh apenas para uma otimizacao de um caso bastante especifico
        if (needle.length() > haystack.length()) return -1;

        for (int i = 0; i <= haystack.length()-needle.length(); i++) {
            // Como uma otimização ao algorítmo de força bruta, só checamos se ele encontrar o caractere inicial
            if (haystack.charAt(i)== needle.charAt(0)) {
                int isValid = 0;
                for(int j = 0;j<needle.length();j++){
                    if(haystack.charAt(i+j)==needle.charAt(j)){
                        // Sempre que encontrar a letra desejada na sequencia, a variavel isValid sera incrementada
                        isValid++;
                    }
                }
                // Se o valor de isValid eh igual ao tamanho de "needle", significa que encontramos
                // A palavra desejada, portanto retornamos o index atual de I
                if (isValid==needle.length()) return i;
            }
        }

        return -1;
    }

    void main() {
        // Testes abertos do leetcode
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
    }
}
