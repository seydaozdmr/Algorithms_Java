package src.datastructures.queuewithnodes;

import java.util.Iterator;

public class RecursiveQueue<T> implements Iterable<T>{


    private class Node{
        T item;
        Node next;
    }
    private Node last;
    private int size;

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public void add(T elem){
        if(isEmpty()){
            last=new Node();
            last.item=elem;
            last.next=last;
        }else{
            Node temp=new Node();
            temp.item=elem;
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        size++;
    }

    public T dequeue(){
        if(!isEmpty()){
            Node first=last.next;
            T temp=first.item;
            last.next=first.next;
            first=null;
            size--;
            return temp;
        }else{
            return null;
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node first=last.next;
            int count=0;

            @Override
            public boolean hasNext() {
                return count<size;
            }

            @Override
            public T next() {
                T temp=first.item;
                first=first.next;
                count++;
                return temp;
            }
        };
    }

}
