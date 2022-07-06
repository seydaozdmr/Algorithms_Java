package src.datastructures;

public interface Stackable<T> {
    void push(T t);
    T pop();
    boolean isEmpty();
    int size();
}
