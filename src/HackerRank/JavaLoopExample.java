package src.HackerRank;

import java.util.Scanner;

public class JavaLoopExample {
    public static void main(String []argh){
        /**
         * We use the integers a, b, n and  to create the following series:
         *
         * You are given 'q' queries in the form of a, b,n
         * and . For each query, print the series corresponding to the given a, b, n
         * and  values as a single line of  space-separated integers.
         */
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int top=0;

            for(int k=0;k<n;k++){
                int result=0;
                result+=Math.pow(2,k);
                //System.out.println("result: "+result);
                top+=result*b;
                System.out.print((a+top)+" ");

            }
            System.out.print("\n");

            //System.out.println("result : "+result);


        }
        in.close();
    }
}
