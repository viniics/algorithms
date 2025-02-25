package Greedy.miniteste4atal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solucao {
    Utils utils = new Utils();
    //TODO: Levar todo esse codigo pra o Atividade service e limpar o main
    void main() {
        Atividade a1 = new Atividade(10, 12, "a1");
        Atividade a2 = new Atividade(14, 18, "a2");
        Atividade a3 = new Atividade(18, 19, "a3");
        Atividade a4 = new Atividade(8, 22, "a4");
        List<Atividade> atividades = Arrays.asList(a1, a2, a3, a4);
        Collections.sort(atividades);
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

    boolean horarioIsLivre(List<Atividade> currentAtividades, Atividade atividade) {
        for (Atividade a : currentAtividades) {
            if (utils.sobrepoeHorario(a, atividade)) {
                return false;
            }
        }
        return true;
    }

}
