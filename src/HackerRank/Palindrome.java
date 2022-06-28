package src.HackerRank;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length=A.length();
        boolean flag=true;
        for(int i=0;i<A.length()/2;i++){
            if(A.charAt(i)!=A.charAt(length-1)){
                flag=false;
                break;
            }
            length-=1;
        }
        System.out.println(flag ? "Yes" : "No");

    }
}
