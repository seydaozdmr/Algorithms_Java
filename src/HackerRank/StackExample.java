package src.HackerRank;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> binary=new Stack<>();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        while(n>0){
            binary.push(n%2);
            n=n/2;
        }

        while(!binary.isEmpty()){
            System.out.println(binary.pop());
        }
    }
}
