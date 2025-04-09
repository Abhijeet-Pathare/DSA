package queue;

public class Main {

    public static void main(String[] args) {
        Queue myQueue = new Queue(3);
        myQueue.printQueue();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.enqueue(5);
        myQueue.printQueue();
    }
}
