package src.datastructures.dijkstra;

import java.util.Stack;

public class InfixExpression {
    /**
     * 1- iki tane stack yarat biri operatörler için diğer işlemler için
     * 2- gelen String ifadeyi diziye çevir
     * 3- bir döngü içinde her bir elemanı değerlendir
     * a- ( gelirse bişey yapma
     * b- operator gelirse operatörlere at
     * c- ')' gelirse önce işlemleri ters olacak şekilde çıkar işlem2 ve işlem1
     * sonra operatörü çıkar, en son işlem1, işlem2 ve operatörü birleştirerek String ifadede tut bu ifadeyi işlemlere at
     * d- eğer sayı gelmişse bunu işlemlere at
     */

    private static String infixToPostfix(String infixExpression){
        Stack<String> operators=new Stack<>();
        Stack<String> operands=new Stack<>();
        String[] arr=infixExpression.split("\\s");

        for(String value:arr){
            if(value.equals("(")){

            }else if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/"))
                operators.push(value);
            else if(value.equals(")")){
                String value2=operands.pop();
                String value1=operands.pop();
                String operator=operators.pop();
                String newExpression=value1+" "+value2+" "+operator;
                operands.push(newExpression);
            }else
                operands.push(value);
        }
        return operands.pop();
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("( ( 1 + 2 ) * ( 4 / 2 ) )"));
    }
}
