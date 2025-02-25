package Greedy.miniteste4atal;

public class Atividade implements Comparable<Atividade> {
    private int horaInicio;
    private int horaTermino;
    private String nome;
    private int duracaoAtividade;

    public Atividade(int horaInicio, int horaTermino, String nome) {
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.nome = nome;
        this.duracaoAtividade = horaTermino - horaInicio;
    }

    public String getNome() {
        return nome;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraTermino() {
        return horaTermino;
    }

    public int[] getIntervaloDeExecucao() {
        int[] intervaloExec = new int[horaTermino - horaInicio];
        for (int i = horaInicio; i < horaTermino; i++) {
            intervaloExec[i - horaInicio] = i;
        }
        return intervaloExec;
    }

    @Override
    public String toString() {
        return "Atividade " + nome;
    }

    public int getDuracaoAtividade() {
        return duracaoAtividade;
    }

    @Override
    public int compareTo(Atividade a) {
        return this.duracaoAtividade - a.getDuracaoAtividade();
    }

}
