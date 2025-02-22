package concurrentAlgorithms.SynchronizedKeyWord;

import java.util.Scanner;

class SynchronizedExample {
    static int contador = 0;

    private static synchronized void incrementar() {
        contador++;
        System.out.println("Incrementado o valor, que agora está em "+contador);
    }

    private static synchronized void printValorAcumulado() {
        System.out.println("Valor atual do contador: " + contador);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numThreads = sc.nextInt();
        for (int i = 0; i < numThreads; i++) {
            new Thread(() -> incrementar()).start();
            new Thread(() -> printValorAcumulado()).start();
        }
        
        sc.close();
    }

}