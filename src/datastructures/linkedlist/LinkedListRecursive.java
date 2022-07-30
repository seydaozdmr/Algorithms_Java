package src.datastructures.linkedlist;

public class LinkedListRecursive<T> {
    class Node{
        T item;
        Node next;
    }

    private Node head;
    private int size;

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public void add(T item){
        if(isEmpty()){
            head=new Node();
            head.item=item;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            Node n=new Node();
            n.item=item;
            current.next=n;
        }
        size++;
    }

    public T remove(){
        if(isEmpty())
            return null;
        if(size==1){
            T temp=head.item;
            head=null;
            size--;
            return temp;
        }
        Node current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        T temp=current.next.item;
        current.next=null;

        size--;
        return temp;
    }

    public void reverseList(){
        head=reverse(head);
    }

    public Node reverse(Node n){
        if(n==null)
            return null;
        if(n.next==null)
            return n;
        Node second=n.next;
        //rest gidilen en sonuncu oluyor.
        Node rest=reverse(second);
        //sonrakinin next'i öncekini gösteriyor
        second.next=n;
        //öncekinin next'i null oluyor.
        n.next=null;
        return rest;
    }

    public void show(String title) {
        System.out.println(title);
        if(!isEmpty()) {
            if(size==1) {
                System.out.println(head.item);
            }else {
                Node temp;
                for(temp=head;temp!=null;temp=temp.next) {
                    System.out.println(temp.item);
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedListRecursive<String> list=new LinkedListRecursive<>();
        list.add("antalya");
        list.add("izmir");
        list.add("adana");
        list.show("Liste");
        list.reverseList();
        list.show("reversed");
    }

}
