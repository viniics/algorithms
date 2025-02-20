package concurrentAlgorithms.ProducerConsumer;

public class Consumer implements Runnable {
    private final Buffer buffer;
    private final int consumerId;

    public Consumer(Buffer buffer, int consumerId) {
        this.buffer = buffer;
        this.consumerId = consumerId;
    }

    @Override
    public void run() {
       while (true) {
        try {
            int newValue = buffer.get();
            System.out.println("Consumidor " + consumerId + " consumiu o valor " + newValue + " no buffer.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       }
    }
}
