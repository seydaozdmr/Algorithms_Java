package src.HackerRank;

import java.util.Scanner;

public class ContiguesSubArraySumNegative {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr=new int[n];
        int start=0;
        while(n>0){
            arr[start++]=sc.nextInt();
            n--;
        }

        int count=0;
        for(int i=0;i<arr.length;i++){
            int toplam=0;
            for(int j=i;j<arr.length;j++){
                toplam+=arr[j];
                if(toplam<0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
