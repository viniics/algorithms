import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWichStringsHaveSameSize {
    static final Map<Integer, List<String>> words = new HashMap<>();

    public static void main(String[] args) {

        ArrayList<String> frases = new ArrayList<>();
        frases.add("bom dia brazil");
        frases.add("bom dia brasil");
        frases.add("mal dia brasil");
        frases.add("trollei brasil");
        frases.add("Lorem Ipsum Sahdt");
        frases.add("1");
        frases.add("2");
        frases.add("mesmo numero de letras nessa string");
        frases.add("gnirts assen sartel ed oremun omsem");
        for (String s : frases) {
            int sLen = s.length();
            addToMap(sLen, s);
        }

        for (Map.Entry<Integer, List<String>> entry: words.entrySet()) {
            List<String> arrayList = entry.getValue();
            if (arrayList.size() > 1) {
                printa(entry.getKey(), arrayList);
            }
        }
    }

    private static void printa(Integer num ,List<String> arrayList) {
        System.out.print(num+ ": ");
        for(String s: arrayList){
            System.out.print(s+ " ");
        }
        System.out.println();
    }

    static synchronized void addToMap(int len, String s) {
        if (!words.containsKey(len)) {
            words.put(len, new ArrayList<>());
        }
        words.get(len).add(s);
    }
}
