package src.datastructures.queuewithnodes;

import java.util.Iterator;

public class QueueWithNodesImpl<T> implements QueueWithNodes<T> {
    private Node head;
    private Node last;
    private int n;

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
        private T item;
        private Node next;
    }
    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public void enqueue(T t) {
        Node oldLast=last;
        last=new Node();
        last.item=t;
        if(isEmpty()){
            head=last;
        }else{
            oldLast.next=last;
        }
        n++;
    }

    @Override
    public T dequeue() {
        if(head==null)
            throw new RuntimeException("kuyruk zaten boş");
        T temp=head.item;
        if(head.next!=null){
            head=head.next;
        }else{
            head=null;
            System.out.println("kuyruk sona erdi");
        }
        n--;
        if(isEmpty())
            last=null;
        return temp;
    }
    @Override
    public void printQueue(){
        if(!isEmpty()){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.item);
                temp=temp.next;
            }
        }else{
            System.out.println("kuyruk boş");
        }
    }
}
