package src.datastructures.stackwithnodes;

public class StackWithNodesMainApp {
    public static void main(String[] args) {
        StackWithNodesImpl<String> test= new StackWithNodesImpl<>();
        test.push("Ankara");
        test.push("İstanbul");
        test.push("Antalya");
        test.push("İzmir");

        for(String elem:test){
            System.out.println(elem);
        }
    }
}
