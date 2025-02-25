package Greedy.miniteste4atal;

public class Atividade {
    private int horaInicio;
    private int horaTermino;
    private String nome;

    public Atividade(int horaInicio, int horaTermino, String nome) {
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.nome = nome;
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
        return "Atividade [nome=" + nome + "]";
    }

}
