package Greedy.miniteste4atal;

public class Utils {
    public boolean contains(int[] nums, int i) {
        for (int j : nums) {
            if (j == i) {
                return true;
            }
        }
        return false;
    }

    public boolean sobrepoeHorario(Atividade atividade1, Atividade atividade2) {
        int[] intervaloA1 = atividade1.getIntervaloDeExecucao();
        int[] intervaloA2 = atividade2.getIntervaloDeExecucao();

        for (int i : intervaloA1) {
            if (contains(intervaloA2, i)) {
                return true;
            }
        }

        for (int i : intervaloA2) {
            if (contains(intervaloA1, i)) {
                return true;
            }
        }
        return false;
    }
}
