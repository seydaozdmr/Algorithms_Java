package src.datastructures.queuewitharray;

public class QueueWithArrayMainApp {
    public static void main(String[] args) {
        QueueWithArray<String> test=new QueueWithArray<>();
        test.enqueue("Ankara");
        test.enqueue("İzmir");
        test.enqueue("İstanbul");
        System.out.println(test.size());

        for(String e:test){
            System.out.println(e);
        }

        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
    }
}
