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
    /**
     * 1-hepsini charArray e at
     * 2-stack oluştur
     * 3-döngü içerisinde 3 adımlı mekanizma
     * a-({[ gelirse yiğina at
     * b-döngü içinde yığın boşsa false döndür çünkü döngü bitene kadar yığın boşalamaz
     * c-en üstteki elemanı çıkar ve çıkan eleman ( ise ) -> {ise -> } ve [ ise ] değilse false dön
     * 4-en sonda eğer yığında eleman kaldıysa false kalmadıysa true dön
     *
     */

    private static boolean checkIfBalanced(String elem){
        char[] arr=elem.toCharArray();
        Stack<Character> stack=new Stack<>();

        for(Character c:arr){
            if(c == '(' || c== '{' || c=='[')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;
                char temp=stack.pop();
                if(temp=='(' && c!=')' || temp=='{' && c!='}' || temp=='[' && c!=']'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
