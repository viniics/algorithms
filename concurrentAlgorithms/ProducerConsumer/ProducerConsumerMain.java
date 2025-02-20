package concurrentAlgorithms.ProducerConsumer;

public class ProducerConsumerMain {

    void main() {
        int bufferSize = 5;
        int producers = 2; // Numero de produtores
        int consumers = 4; // Numero de consumidores

        Buffer buffer = new Buffer(bufferSize);

        for (int i = 1; i <= producers; i++) {
            new Thread(new Producer(buffer, i)).start();
        }

        for (int i = 1; i <= consumers; i++) {
            new Thread(new Consumer(buffer, i)).start();
        }
    }

}