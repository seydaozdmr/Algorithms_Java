package src.HackerRank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InvertQueue {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("Ankara");
        queue.offer("İstanbul");
        queue.offer("Antalya");

        invertQueue(queue);
        for(String elem:queue){
            System.out.println(elem);
        }
    }

    private static void invertQueue(Queue<String> queue){
        Stack<String> stack=new Stack<>();

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
    }
}
