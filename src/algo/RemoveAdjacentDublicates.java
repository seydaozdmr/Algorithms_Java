package src.algo;

import java.util.Iterator;
import java.util.Stack;

public class RemoveAdjacentDublicates {

    public static String removeAdjacentDublicate(String str){
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!st.isEmpty() && (Character)st.peek() == str.charAt(i)){
                st.pop();
            }else{
                st.push(str.charAt(i));
            }
        }

        Iterator iter = st.iterator();
        while(iter.hasNext()){
            sb.append(iter.next());
        }

        return sb.toString();
    }

    public static void main(String ...args){
        String val="caaabbbc";
        String result=removeAdjacentDublicate(val);
        System.out.println(result);
    }
}
