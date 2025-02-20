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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
}
