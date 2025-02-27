// Uma vez, fiz uma entrevista de código onde a solução do problema envolvia a alteração de caracteres numa String.
public class SwappingChars {
    void main(String[] args) {
        String frase = "Nova frase";
        frase = swap(frase, 2, 4);
        System.out.println(frase);
    }

    String swap(String frase, int index1, int index2){
        char[] temp = frase.toCharArray();
        char swap = temp[index1];
        temp[index1] = temp[index2];
        temp[index2] = swap;
        return new String(temp);
    }
}
