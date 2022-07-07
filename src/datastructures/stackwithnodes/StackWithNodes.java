package src.datastructures.stackwithnodes;

public interface StackWithNodes<T> {
    boolean isEmpty();
    int size();
    T pop();
    void push(T t);
}
