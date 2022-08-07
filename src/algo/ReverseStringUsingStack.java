package src.algo;


import java.io.OutputStream;
import java.util.Stack;

public class ReverseStringUsingStack {

    private static String reverse(String str){
        Stack<Character> stack=new Stack();

        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }

        StringBuilder builder=new StringBuilder();

        for(int i=0;i<str.length();i++){
            builder.append(stack.pop());
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String deneme="deneme";
        System.out.println(reverse(deneme));
    }

}
