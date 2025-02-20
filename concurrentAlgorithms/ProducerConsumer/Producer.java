package concurrentAlgorithms.ProducerConsumer;

import java.util.Random;

public class Producer implements Runnable {
    private final Buffer buffer;
    private final int producerId;
    private final Random random = new Random();

    public Producer(Buffer buffer, int producerId) {
        this.buffer = buffer;
        this.producerId = producerId;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int newValue = random.nextInt(100);
                buffer.put(newValue);
                System.out.println("Produtor " + producerId + " inseriu o valor " + newValue + " no buffer.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
