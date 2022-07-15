package src.datastructures.linkedlist;

import java.util.Iterator;

public class ReverseLinkedList<T> implements Iterable<T>{
    public static void main(String[] args) {
        ReverseLinkedList<String> test = new ReverseLinkedList<>();
        test.add("İstanbul");
        test.add("İzmir");
        test.add("Antalya");
        test.print();
        test.reverse3();
        test.print();
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
            Node temp=new Node();
            temp.item=item;
            current.next=temp;
        }
        size++;
    }

    public Node reverse(){
        if(isEmpty())
            return null;
        if(size==1)
            return head;
        /**
         * 1-old -> head'i tutuyor
         * 2-current-> head.next'i
         * 3-newNode ise sıradaki 3. node'u eğer varsa tutuyor yoksa null
         * 4-head'in next'i null gösteriyor
         * 5-head current oluyor
         * 6-current.next ise old yani eski head oluyor dolaysıyla, örneğin ikinci birinciyi gösteriyor bağ tersine çevriliyor.
         * 7-bu işlem while döngüsü ile en son node'a kadar uygulanıyor.
         * en sonun ilk haldeki en sonraki node'u gösteriyor ve linkedlist tersine çevrilmiş oluyor.
         */
        Node old=head;
        Node current=head.next;
        Node newNode=head.next.next;
        head.next=null;
        head=current;
        current.next=old;
        while (newNode!=null){
            old=current;
            current=newNode;
            newNode=newNode.next;
            current.next=old;
            head=current;
        }
        return head;
    }

    public Node reverse2(){
        /**
         * 1-reverse boş bir node
         * 2-head null olmayana kadar yani linkedlist'in sonuna kadar gidecek.
         * 3-Node second her zaman head'in onundeki node yani başa geçecek node
         * 4-head.next önce reverse'i gösteriyor.
         * 5-reverse-> head'i yani önceki ilk sırayı gösteriyor.
         * 6-head ise second'u yani önce headin gösterdiği sıraki node artık head oluyor. head ise bir önceki işlemdeki reverse'i gösteriyor.
         */
        Node reverse=null;
        while(head!=null){
            Node second=head.next;
            head.next=reverse;
            reverse=head;
            head=second;
        }
        /**
         * her defasında second head.next'i tutuyor bir öndekini
         * head.next ise öncekini gösteriyor.
         * reverse daha sonra head oluyor ve head artık daha önce head'in bir önündeki oluyor.
         * en son adımda head'in next'i null oluyor ve second null'ı gösteriyor.
         * head.next bir öncekini gösteriyor.
         * reverse head oluyor yani baş oluyor
         * head ise null oluyor yani linkedlist'in bittiği noktada duruyor.
         * bitişte head reverse olarak ayarlanıyor.
         * reverse geri döndürülüyor.
         */
        head=reverse;
        return reverse;
    }

    /**
     * Recursive solution
     */

    public void reverse3(){
        head = recursiveReverse(head);
    }

    private Node recursiveReverse(Node head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        Node second=head.next;
        Node rest=recursiveReverse(second);
        second.next=head;
        head.next=null;
        return rest;
    }

    public void print(){
        Node current=head;
        while(current!=null){
            System.out.println(current.item);
            current=current.next;
        }
    }


}
