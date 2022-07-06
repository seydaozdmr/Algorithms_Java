package src.HackerRank;

import java.util.Scanner;

public class ExceptionHandling2 {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}

class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    public Long power(int n,int p) throws Exception{
        //Scanner sc=new Scanner(System.in);
        if(n<0 || p<0)
            throw new Exception("n or p should not be negative.");
        if(n==0 && p==0)
            throw new  Exception("n and p should not be zero.");

        Long result=1l;
        for(int i=0;i<p;i++){
            result*=n;
        }
        return result;

    }

}