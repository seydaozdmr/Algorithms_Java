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
        System.out.println(completeParenthesis2("1+2)*3-4)*5-6)))"));
    }
    /**
     * 1- iki tane stack yarat biri işlemler ve biri sayılar için (bu aynı zamanda sonucu tutacak
     * 2- bir tane char array yarat gelen string'in elemanlarını tutan
     * 3- döngüye al
     * a- gelen '(' ise bişey yapma
     * b- gelen operatör ise +-* bunları işlemler stack'ine at
     * c- gelen ')' ise önce son iki sayıyı pop et ve son işlemi pop et sonra iki işlemi '(' + sayı1 + işlem + sayı2 + ')' şeklinde birleştirip
     * işlemler stackine yolla
     * d- gelen sayı ise sayılar stack'ine at
     */

    public static String completeParenthesis2(String elem){
        Stack<String> operands =new Stack<>();
        Stack<Character> operators=new Stack<>();
        char[] elems=elem.toCharArray();
        for(Character e:elems){
            if(e=='('){

            }else if(e=='+' || e=='-' || e=='*' || e=='/')
                operators.push(e);
            else if(e==')'){
                StringBuilder builder=new StringBuilder();
                String operands2=operands.pop();
                String operands1=operands.pop();
                builder.append('('+operands1+operators.pop()+operands2+')');
                operands.push(builder.toString());
            }else {
                operands.push(String.valueOf(e));
            }

        }
        return operands.pop();
    }
}
