package src.datastructures.bag;

import java.util.Iterator;

public class BagMain {
    public static void main(String[] args) {
        Bag<String> myBag=new Bag<>();
        myBag.add("Ankara");
        myBag.add("İstanbul");
        myBag.add("İzmir");

        Iterator iterator= myBag.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
