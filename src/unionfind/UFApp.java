package src.unionfind;

public class UFApp {
    public static void main(String[] args) {
        UF test=new UF(10);
        test.union(1 ,2);
        System.out.println(test.count());
        test.union(3,4);
        System.out.println(test.count());
        test.union(5,6);
        test.union(7,8);
        test.union(7,9);
        test.union(2,8);
        test.union(0,5);
        test.union(1,9);
        System.out.println(test.count());
    }
}
