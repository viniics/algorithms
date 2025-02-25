package Greedy.miniteste4atal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AtividadeService {
    //todo: organizar os metodos nessa classe e tirar do main
    Utils utils = new Utils();

    List<Atividade> greedyAtividades(List<Atividade> atividades) {
        sort(atividades);
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

    void sort(List<Atividade> atividades){
        Collections.sort(atividades);
    }
}
