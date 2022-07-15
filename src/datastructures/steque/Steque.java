package src.datastructures.steque;

public class Steque<T> {
    private class Node {
        T item;
        Node next;
        Node prev;
    }

    private Node first;
    private Node last;
    private int size;
    public boolean isEmpty() {
        return size==0;
    }
    public int size() {
        return size;
    }

    public void push(T elem){
        Node current=first;
        first=new Node();
        first.item=elem;
        first.next=current;

        if(current!=null)
            current.prev=first;
        else
            last=first;
        size++;
    }

    public T pop(){
        if(isEmpty())
            return null;
        T elem=first.item;
        first=first.next;
        if(first!=null){
            first.prev=null;
        }else{
            last=null;
        }
        size--;
        return elem;
    }

    public void enqueue(T elem){
        Node oldLast=last;
        last=new Node();
        last.item=elem;
        last.prev=oldLast;

        if(oldLast!=null){
            oldLast.next=last;
        }else{
            first=last;
        }
        size++;
    }

    public T dequeue(){
        if(isEmpty())
            return null;
        T temp=first.item;
        first=first.next;
        if(first!=null)
            first.prev=null;
        else
            last=null;
        return temp;
    }

    public static void main(String[] args) {
        Steque liste = new Steque();
        liste.push(1);
        liste.push(2);
        liste.push(3);
        liste.push(4);
        liste.push(5);

        System.out.println(liste.pop());
        System.out.println(liste.pop());
        System.out.println(liste.dequeue());
        System.out.println(liste.dequeue());
        System.out.println(liste.dequeue());
    }


}
