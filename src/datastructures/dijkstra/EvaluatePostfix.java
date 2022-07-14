package src.datastructures.dijkstra;

import java.util.Stack;

public class EvaluatePostfix {
    private static int evaluatePostfix(String elem){
        Stack<Integer> operands=new Stack<>();

        String[] arr=elem.split("\\s");
        for(String e:arr){
            if(e.equals("+")||e.equals("-")||e.equals("*")||e.equals("/")){
                int operands2=operands.pop();
                int operands1=operands.pop();

                int result = 0;
                if (e.equals("+")) {
                    result = operands1 + operands2;
                } else if (e.equals("-")) {
                    result = operands1 - operands2;
                } else if (e.equals("*")) {
                    result = operands1 * operands2;
                } else if (e.equals("/")) {
                    result = operands1 / operands2;
                }
                operands.push(result);
            }
            else{
                operands.push(Integer.parseInt(e));
            }
        }
        return operands.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostfix("1 2 + 4 2 / *"));
    }
    /**
     * 1- işlenen ya da işlem sırası gelmeyen sayıları tutmak için stack yaratılır
     * 2- String array'i gelen string elemanı tek tek karakter halinde tutar
     * 3- Oluşan karakter dizisi döngü içine alınır
     * a- eğer sıradaki eleman bir operatör ise son iki sayı stackten çıkartılır gelen işleme göre bir int 'da işlem yapılır ve tutulur
     * b- işlem bittikten sonra stack'e bu sonuç eklenir.
     * 4- eğer karakter işlem değilse gelen sayı doğrudan stack'e eklenir.
     */

}
