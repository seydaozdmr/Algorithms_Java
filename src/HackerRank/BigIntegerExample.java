package src.HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();

        BigInteger a1=new BigInteger(a);
        BigInteger b1=new BigInteger(b);

        System.out.println(a1.add(b1));
        System.out.println(a1.multiply(b1));
    }
}
