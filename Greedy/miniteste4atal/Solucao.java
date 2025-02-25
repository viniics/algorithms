package Greedy.miniteste4atal;

import java.util.Arrays;
import java.util.List;

public class Solucao {
    private final AtividadeService atividadeService = new AtividadeService();
    void main() {
        List<Atividade> atividades = criaAtividades();
        System.out.println(atividadeService.greedyAtividades(atividades).toString());
    }

    List<Atividade> criaAtividades() {
        Atividade a1 = new Atividade(10, 12, "a1");
        Atividade a2 = new Atividade(14, 18, "a2");
        Atividade a3 = new Atividade(18, 19, "a3");
        Atividade a4 = new Atividade(8, 22, "a4");
        Atividade a5 = new Atividade(5, 6, "a5");
        List<Atividade> atividades = Arrays.asList(a1, a2, a3, a4, a5);
        return atividades;
    }
}
