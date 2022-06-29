package src.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicSizeArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            List<Integer> temp=new ArrayList<>();

            for(int j=0;j<d;j++){
                int tempNum=sc.nextInt();
                temp.add(tempNum);
            }
            result.add(temp);
        }
        System.out.println(result.size());

        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(result.get(x-1).size()>=(y) && !result.get(x-1).isEmpty()){
                if(result.get(x-1).get(y-1)!=null){
                    System.out.println(result.get(x-1).get(y-1));
                }else{
                    System.out.println("ERROR!");
                }
            }else{
                System.out.println("ERROR!");
            }
        }


    }
}
