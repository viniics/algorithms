package SearchOcurrencies;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

class SearchOcurrencies{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Path fileName = Path.of("C:\\Users\\vinii\\OneDrive\\Área de Trabalho\\ATAL\\algorithms\\SearchOcurrencies\\fileToRead.txt");
        String fileToString  = Files.readString(fileName);
        String search = sc.nextLine();
    }
}