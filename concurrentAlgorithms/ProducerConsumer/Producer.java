package concurrentAlgorithms.ProducerConsumer;

public class Producer implements Runnable {
    private final Buffer buffer;
    private final int producerId;

    public Producer(Buffer buffer, int producerId) {
        this.buffer = buffer;
        this.producerId = producerId;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
