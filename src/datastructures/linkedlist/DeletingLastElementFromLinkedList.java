package src.datastructures.linkedlist;

import java.util.Iterator;

public class DeletingLastElementFromLinkedList<T> implements Iterable<T> {

    public static void main(String[] args) {
        DeletingLastElementFromLinkedList<Integer> linkedList = new DeletingLastElementFromLinkedList<>();
        linkedList.addItem(0);
        linkedList.addItem(1);
        linkedList.addItem(2);
        linkedList.addItem(3);
        linkedList.print();
        linkedList.deleteLastElem();
        linkedList.print();

        DeletingLastElementFromLinkedList<String> testString=new DeletingLastElementFromLinkedList<>();
        testString.addItem("İzmir");
        testString.addItem("Antalya");
        testString.addItem("Ankara");
        boolean result= testString.find(testString.first, "İzmira");
        System.out.println(result);
        System.out.println("***********************");
        testString.print();
        testString.addElement("Ankara","İstanbul");
        System.out.println("***********************");
        testString.print();
        DeletingLastElementFromLinkedList.Node temp=new DeletingLastElementFromLinkedList<String>().new Node();
        temp.elem="İzmir";
        DeletingLastElementFromLinkedList.Node newNode=new DeletingLastElementFromLinkedList<String>().new Node();
        newNode.elem="Edirne";
        testString.insertAfter(temp,newNode);
        System.out.println("**************");
        testString.print();
        System.out.println("**************");
        testString.remove("Edirne");
        testString.print();
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{

        Node current=first;
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

    private class Node{
        T elem;
        Node next;
    }

    private Node first;
    private int n;

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }

    public void addItem(T elem){
        Node temp=new Node();
        temp.elem=elem;

        if(first==null){
            first=temp;
            n++;
        }else{
            Node current=first;
            while(current.next!=null){
                current=current.next;
            }
            current.next=temp;
            n++;
        }
    }
    public T deleteLastElem() {
        if(!isEmpty()){
            T temp;
            if(n==1){
                temp=first.elem;
                first=null;
            }else{
                Node current=first.next;
                while(current.next.next!=null){
                    current=current.next;
                }
                temp=current.next.elem;
                current.next=null;
            }
            n--;
            return temp;
        }else {
            throw new RuntimeException("silinecek bir elemen yoktur.");
        }
    }

    public void print(){
        Node current=first;
        while(current!=null){
            System.out.println(current.elem);
            current=current.next;
        }
    }

    public boolean find(Node node,T elem){
        Node current=node;
        while(current.next!=null){
            if(node.elem.equals(elem))
                return true;
            current=current.next;
        }
        return false;
    }

    public Node findNode(T elem){
        Node current=first;

        while(current!=null){
            if(current.elem.equals(elem))
                return current;
            current=current.next;
        }
        return null;
    }

    public void addElement(T oldElement,T newElement){
        Node findOldElement=findNode(oldElement);
        Node newNode=new Node();
        newNode.elem=newElement;
        if(findOldElement!=null){
            if(findOldElement.next!=null){
                Node temp=findOldElement.next;
                findOldElement.next=newNode;
                newNode.next=temp;
            }else{
                findOldElement.next=newNode;
            }
        }else{
            first=newNode;
        }
    }
    public void removeAfter(Node node){
        if(!isEmpty() && node!=null){
            Node current=first;
            while(current!=null){
                if(current.elem.equals(node.elem)){
                    if(current.next!=null){
                        current.next=current.next.next;
                        n--;
                    }
                    break;
                }
                current=current.next;
            }
        }
    }

    public void insertAfter(Node old,Node second){
        if(old !=null && second!=null){
            Node current=first;
            while(current!=null){
                if(current.elem.equals(old.elem)){
                    Node temp=current.next;
                    second.next=temp;
                    current.next=second;
                    break;
                }
                current=current.next;
            }
        }
    }

    public void remove(T elem){
        if(isEmpty() || elem==null){
            return;
        }
        while(first!=null && first.elem.equals(elem)){
            first=first.next;
            n--;
        }

        Node current=first;
        while(current!=null){
            Node next=current.next;
            //currentin önündekiler silip current'i next'e bağlıyoruz.
            while(next!=null && next.elem.equals(elem)){
                next=next.next;
                n--;
            }
            current.next=next;
            current=current.next;
        }
    }

    public int max(){
        if(isEmpty())
            return 0;
        int currentMaxValue=(Integer) first.elem;
        return getMax(first.next,currentMaxValue);
    }

    private int getMax(Node next, int currentMaxValue) {
        if(next==null)
            return currentMaxValue;
        int currentValue=(Integer) next.elem;
        if(currentValue>currentMaxValue)
            currentMaxValue=currentValue;
        return getMax(next.next,currentMaxValue);
    }
}
