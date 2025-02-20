package concurrentAlgorithms.ProducerConsumer;

public class Buffer {
    private final int[] buffer;
    private int itemCount = 0;
    private int in = 0;
    private int out = 0;


    public Buffer(int size){
        this.buffer = new int[size];
    }

    public void put(int value){
        buffer[in] = value;
        in++;
        if(in==buffer.length){
            in=0;
        }
        itemCount++;
    }
    public int get(){
        int value = buffer[out];

        return value;
    } 
}
