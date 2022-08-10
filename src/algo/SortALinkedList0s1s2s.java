package src.algo;

public class SortALinkedList0s1s2s {

    private static class Node{
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }
    private Node head;

    public Node sortLinkedList(){
        //0s - 1s -2s
        int countArr[] =new int[3];

        Node temp=head;
        while(temp!=null){
            //0-1-2 hangisinden kaç tane varsa countArr'de sayıyoruz.
            ++countArr[temp.item];
            temp=temp.next;
        }

        temp=head;
        int i=0;
        while(temp!=null){
            //countArr'de sıradaki değer 0-1-2 hiç yoksa i'yi bir arttıyoruz.
            if(countArr[i]==0)
                i++;
            else{
                //sırasıyla 0 - 1  ve 2 değerlerini linkedList'in sıradaki node'una yazıyoruz.
                temp.item=i;
                //yazdığımız değeri listeden 1 azaltıyoruz.
                int val=countArr[i]--;
                temp=temp.next;
            }
        }

        return this.head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(0);
        Node n4 = new Node(1);
        Node n5 = new Node(0);
        Node n6 = new Node(2);
        Node n7 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;

        for(Node temp = n1; temp != null; temp = temp.next) {
            System.out.println(temp.item);
        }

        System.out.println("*******************");

        SortALinkedList0s1s2s liste = new SortALinkedList0s1s2s();
        liste.head = n1;
        liste.sortLinkedList();

        for(Node temp2 = liste.head; temp2 != null; temp2 = temp2.next) {
            System.out.println(temp2.item);
        }

    }
}
