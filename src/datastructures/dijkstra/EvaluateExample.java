package src.datastructures.dijkstra;

import java.util.Scanner;
import java.util.Stack;

public class EvaluateExample {
    public static void main(String[] args) {
        Stack<String> ops=new Stack<>();
        Stack<Double> values=new Stack<>();

        Scanner sc=new Scanner(System.in);
        String value;
        while(!(value=sc.nextLine()).isEmpty()){
            if(value.equals("("));
            else if(value.equals("+")) ops.add(value);
            else if(value.equals("-")) ops.add(value);
            else if(value.equals("/")) ops.add(value);
            else if(value.equals("*")) ops.add(value);
            else if(value.equals(")")){
                String op=ops.pop();
                double v=values.pop();
                if(op.equals("+")) v=values.pop()+v;
                else if(op.equals("-")) v=values.pop()-v;
                else if(op.equals("/")) v=values.pop()/v;
                else if(op.equals("*")) v=values.pop()*v;
                values.push(v);
            }else{
                values.push(Double.parseDouble(value));
            }
        }
        System.out.println(values.pop());
    }
}
