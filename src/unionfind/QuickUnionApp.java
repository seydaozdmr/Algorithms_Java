package src.unionfind;

public class QuickUnionApp {
    public static void main(String[] args) {
        QuickUnion quickUnion=new QuickUnion();
        quickUnion.union(1,0);
        quickUnion.union(8,1);
        quickUnion.print();
    }
}
