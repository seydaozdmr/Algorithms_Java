package src.HackerRank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIteratorExample {
    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String) {
                String temp = String.valueOf(element);
                if (!temp.equals("###"))
                    continue;
                try {
                    Integer.parseInt(temp);
                } catch (NumberFormatException e) {
                    continue;
                }
                System.out.println(temp);
            }else{
                break;
            }
        }
        return it;
    }
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
