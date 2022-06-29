package src.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaListExample {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            int elem=sc.nextInt();
            result.add(elem);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            String query=sc.next();
            if(query.equals("Insert")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                if(x==result.size()){
                    result.add(y);
                    continue;
                }
                result.set(x, y);
            }else if(query.equals("Delete")){
                int x=sc.nextInt();
                result.remove(x);
            }
        }

        result.stream().forEach(e->System.out.print(e+" "));

    }
}
