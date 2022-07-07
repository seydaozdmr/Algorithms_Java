package src.datastructures.stackwithnodes;

import java.util.Iterator;
import java.util.function.Consumer;

public class StackWithNodesImpl<T> implements StackWithNodes<T>,Iterable<T>{
    private Node head;
    private int n=0;

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public T pop() {
        T temp=head.item;
        head=head.next;
        n--;
        return temp;
    }

    @Override
    public void push(T t) {
        Node temp=head;
        head=new Node();
        head.item=t;
        head.next=temp;
        n++;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node current=head;
            @Override
            public boolean hasNext() {
                return current!=null;
            }

            @Override
            public T next() {
                T temp=current.item;
                current=current.next;
                return temp;
            }
        };
    }

    private class Node{
        T item;
        Node next;
    }


}

