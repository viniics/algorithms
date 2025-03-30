package concurrentAlgorithms.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 1; i <= 15; i++) {
            executorService.execute(new Task(i));
        }
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        executorService.shutdownNow();
        System.out.println("Fim do programa!");
    }
}

class Task implements Runnable {
    int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(id * 50);
        } catch (InterruptedException e) {
        }

        if (id == 10) {
            throw new WrongThreadException("ID Inválido");
        }
        System.out.println("Thread numero:" + id);
    }

}