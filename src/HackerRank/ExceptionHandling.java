package src.HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);

        try{
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int result=x/y;
            System.out.println(result);
        }catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }catch(ArithmeticException e){
            System.out.println(e.getClass().getName()+": "+e.getMessage());
        }
    }
}
