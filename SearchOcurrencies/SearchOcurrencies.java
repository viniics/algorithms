package SearchOcurrencies;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

class SearchOcurrencies {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Path fileName = Path.of("SearchOcurrencies/fileToRead.txt");
        String fileToString = Files.readString(fileName);
        System.out.print("Faça sua pesquisa: ");
        String search = sc.nextLine();
        sc.close();
        System.out.println(processResults(searchOcurrencies(search, fileToString)));

    }

    private static ArrayList<Integer> searchOcurrencies(String search, String file) {
        ArrayList<Integer> resultIndexes = new ArrayList<>();

        for (int i = 0; i < (file.length() - search.length()); i++) {
            int currentPos = 0;
            while (currentPos < search.length() && search.charAt(currentPos) == file.charAt(i + currentPos)) {
                currentPos++;
            }
            if (currentPos == search.length()) {
                resultIndexes.add(i);
            }
        }
        return resultIndexes;
    }

    private static String processResults(ArrayList<Integer> list) {
        if (list.size()==0) return "Não foram encontrados resultados para a pesquisa!";
        
        return "Foram encontradas correspondencias nos seguintes indices: " + list.toString();
    }
}
