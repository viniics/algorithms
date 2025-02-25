package Greedy.miniteste4atal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solucao {
    Utils utils = new Utils();
    SortByLowestExecutionTime sortByLowestExecutionTime = new SortByLowestExecutionTime();

    void main() {
        Atividade a1 = new Atividade(10, 12);
        Atividade a2 = new Atividade(14, 17);
        List<Atividade> atividades = Arrays.asList(a1, a2);
        sortByLowestExecutionTime.sort(atividades);
        List<Atividade> greedyAtividades = greedyAtividades(atividades);
        System.out.println(greedyAtividades.toString()); //todo: colocar melhor como as atividades sao representadas
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

    boolean horarioIsLivre(List<Atividade> currentAtividades, Atividade atividade) {
        for (Atividade a : currentAtividades) {
            if (sobrepoeHorario(a, atividade)) {
                return false;
            }
        }
        return true;
    }

    boolean sobrepoeHorario(Atividade atividade1, Atividade atividade2) {
        int[] intervaloA1 = atividade1.getIntervaloDeExecucao();
        int[] intervaloA2 = atividade2.getIntervaloDeExecucao();

        for (int i : intervaloA1) {
            if (utils.contains(intervaloA2, i)) {
                return true;
            }
        }

        for (int i : intervaloA2) {
            if (utils.contains(intervaloA1, i)) {
                return true;
            }
        }

        return false;
    }

}
