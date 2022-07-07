package src.datastructures.queuewithnodes;

public class QueueMainApp {
    public static void main(String[] args) {
        QueueWithNodes<String> test=new QueueWithNodesImpl<>();
        test.enqueue("Ankara");
        test.enqueue("İzmir");
        test.enqueue("İstanbul");
        test.enqueue("Adana");
        test.enqueue("Mersin");
        System.out.println(test.dequeue());
        test.printQueue();

        int i=1;
        for(String elem:test){
            System.out.println(i+" : "+elem);
            i++;
        }
    }
}
