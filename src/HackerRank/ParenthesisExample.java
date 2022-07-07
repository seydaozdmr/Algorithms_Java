package src.HackerRank;


import java.util.Scanner;
import java.util.Stack;

public class ParenthesisExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String expression=scanner.next();
        System.out.println(isBalanced(expression));
    }

    private static boolean isBalanced(String s){
        char[] arr=s.toCharArray();
        Stack<Character> stack=new Stack();

        for(char elem:arr){
            if(elem == '(' || elem=='[' || elem=='{'){
                stack.push(elem);
            }else{
                if(stack.isEmpty())
                    return false;
                char eleman=stack.pop();
                if(elem==')' && eleman!='(' || elem==']' && eleman!='[' || elem=='}' && eleman!='{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
