package src.HackerRank;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            Stack<String> stack=new Stack<>();
            char[] arr=input.toCharArray();
            if(arr.length%2!=0){
                System.out.println("false");
                continue;
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i]==')' && stack.size()>0 && stack.peek().equals("("))
                    stack.pop();
                else if(arr[i]=='}' && stack.size()>0 && stack.peek().equals("{"))
                    stack.pop();
                else if(arr[i]==']' && stack.size()>0 && stack.peek().equals("["))
                    stack.pop();
                else
                    stack.push(String.valueOf(arr[i]));
            }
            if(stack.size()==0)
                System.out.println("true");
            else
                System.out.println("false");

        }

    }
}
