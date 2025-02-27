import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class QuestaoC {

    public int sla(int degraus, int multiplo, ArrayList<Integer> lista) {
        if (multiplo > degraus)
            return -1;
        if (degraus == 0)
            return lista.size();
        if (degraus - multiplo < 0) {
            lista.add(1);
            return sla(degraus--, multiplo, lista);
        }
        
        lista.add(2);
        return sla(degraus - 2, multiplo, lista);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int degraus, multiplo = Map(Integer.class, st.split(st));{
            }
}
