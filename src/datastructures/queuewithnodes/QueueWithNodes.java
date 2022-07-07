package src.datastructures.queuewithnodes;

public interface QueueWithNodes<T> extends Iterable<T> {
    boolean isEmpty();
    int size();
    void enqueue(T t);
    T dequeue();
    void printQueue();
}
