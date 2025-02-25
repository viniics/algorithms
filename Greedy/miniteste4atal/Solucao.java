package Greedy.miniteste4atal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solucao {
    SortByLowestExecutionTime sortByLowestExecutionTime = new SortByLowestExecutionTime();

    void main() {
        Atividade a1 = new Atividade(10, 12);
        Atividade a2 = new Atividade(14, 17);
        List<Atividade> atividades = Arrays.asList(a1, a2);
        sortByLowestExecutionTime.sort(atividades);
        List<Atividade> greedyAtividades = greedyAtividades(atividades);
        System.out.println(greedyAtividades.toString());
    }

    List<Atividade> greedyAtividades(List<Atividade> atividades) {
        List<Atividade> greedyOut = new ArrayList<>();
        for (Atividade atividade : atividades) {
            if (horarioIsLivre(greedyOut, atividade)) {
                greedyOut.add(atividade);
            }
        }
        return greedyOut;
    }

    boolean horarioIsLivre(List<Atividade> greedyOut, Atividade atividade) {
        
        return true;
    }
}
