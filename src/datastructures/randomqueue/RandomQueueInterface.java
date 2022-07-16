package src.datastructures.randomqueue;

public interface RandomQueueInterface<T> {
    boolean isEmpty();
    int size();
    void enqueue(T item);
    T dequeue();
    T sample();
    void resize(int capacity);

}
