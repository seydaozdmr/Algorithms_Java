package src.datastructures;

public class StackMain {
    public static void main(String[] args) {

        MyStack<String> myStack=new MyStack<>();
        myStack.push("antalya");
        myStack.push("ankara");
        myStack.push("istanbul");
        myStack.push("edirne");
        myStack.push("aksaray");
        System.out.println(myStack.size());
        myStack.writeElements();
    }
}
