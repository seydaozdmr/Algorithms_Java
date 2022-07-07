package src.datastructures.linkedlist;

public class LinkedList<T> {
    private Node head;
    private int n;

    private class Node{
        T item;
        Node next;
    }

    public void add(T item){
        if(head==null){
            head = new Node();
            head.item=item;
            head.next=null;
            n++;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            Node temp=new Node();
            temp.item=item;
            temp.next=null;
            current.next=temp;
            n++;
        }
    }

    public void addHeadOfTheList(T item){
        if(head==null){
            head=new Node();
            head.item=item;
            n++;
        }else{
            Node temp=head;
            head=new Node();
            head.item=item;
            head.next=temp;
            n++;
        }
    }

    public T removeLast(){
        if(head==null)
            throw new RuntimeException("silinecek bir eleman yok");
        T item=null;
        if(head.next!=null){
            Node current=head;
            while(current.next.next!=null){
                current=current.next;
            }
            item=current.next.item;
            current.next=null;
            n--;
            return item;
        }else{
            item=head.item;
            head=null;
            n--;
            return item;
        }
    }

    public T removeFirstItemFromList(){
        if(head==null){
            throw new RuntimeException("Listen zaten boş");
        }
        T tempItem=head.item;
        if(head.next!=null){
            head=head.next;
            n--;
        }else{
            head=null;
            n--;
        }
        return tempItem;
    }
    public int size(){
        return n;
    }

    public void printList(){
        if(head==null)
            throw new RuntimeException("Bu liste boş neyini yazdıracaksın");
        Node current=head;
        while(current!=null){
            System.out.println(current.item);
            current=current.next;
        }
    }
}
