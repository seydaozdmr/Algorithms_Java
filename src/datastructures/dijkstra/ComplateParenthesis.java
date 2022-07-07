package src.datastructures.dijkstra;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ComplateParenthesis {
    private static String completeParenthesis(String input){
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();

        char[] inputValues = input.toCharArray();

        for (char value : inputValues) {
            if (value=='(') {
                //do nothing
            } else if (value=='+'
                    || value=='-'
                    || value=='*'
                    || value=='/') {
                operators.push(String.valueOf(value));
            } else if (value==')') {
                String operator = operators.pop();
                String value2 = operands.pop();
                String value1 = operands.pop();

                String subExpression = "( " + value1 + " " + operator + " " + value2 + " )";
                operands.push(subExpression);
            } else {
                operands.push(String.valueOf(value));
            }
        }

        return operands.pop();
    }

    public static void main(String[] args) {
        System.out.println(completeParenthesis("1+2)*3-4)*5-6)))"));

    }
}
