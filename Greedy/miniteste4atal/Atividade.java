package Greedy.miniteste4atal;

public class Atividade {
    private int horaInicio;
    private int horaTermino;

    public Atividade(int horaInicio, int horaTermino) {
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraTermino() {
        return horaTermino;
    }

    public int[] getIntervaloDeExecucao(){
        int[] intervaloExec = new int[horaTermino-horaInicio];
        for(int i = horaInicio; i< horaTermino;i++){
            intervaloExec[i-horaInicio] = i;
        }
        return intervaloExec;
    }

}
