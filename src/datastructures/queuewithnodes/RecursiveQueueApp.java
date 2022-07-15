package src.datastructures.queuewithnodes;

public class RecursiveQueueApp {
    public static void main(String[] args) {
        RecursiveQueue<String> test=new RecursiveQueue<>();
        test.add("İstanbul");
        test.add("Ankara");
        test.add("İzmir");
        System.out.println(test.size());
        for(String elem:test){
            System.out.println(elem);
        }
    }
}
