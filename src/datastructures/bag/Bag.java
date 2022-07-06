package src.datastructures.bag;

import java.util.Iterator;

public class Bag<T> implements Iterable<T> {

    class Node{
        T elem;
        Node next;
    }

    private Node head;
    private int size;

    public void add(T elem){
        //Bütün node'ların ilkini tutuyorum.
        Node oldHead=head;
        //ilk node yerine yeni node ekliyorum.
        head=new Node();
        head.elem= elem;
        //yeni head'in tuttuğum head'i göstermesini sağlıyorum
        head.next=oldHead;

        size++;
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{

        Node current=head;

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public T next() {
            T temp=current.elem;
            current=current.next;
            return temp;
        }
    }
}
