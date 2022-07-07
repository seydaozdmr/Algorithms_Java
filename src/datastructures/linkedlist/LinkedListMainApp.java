package src.datastructures.linkedlist;

public class LinkedListMainApp {
    public static void main(String[] args) {
        LinkedList<String> test=new LinkedList<>();
        test.add("Antalya");
        test.add("İzmir");
        test.add("Adana");
        System.out.println(test.size());
        System.out.println(test.removeLast());
        System.out.println(test.size());
        test.addHeadOfTheList("İstanbul");
        System.out.println(test.size());
        //System.out.println(test.removeFirstItemFromList());
        System.out.println(test.size());
        test.printList();
    }
}
