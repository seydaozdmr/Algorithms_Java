package src.HackerRank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeueExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        /**
         * HashSet<Integer> set = new HashSet<>();
         *
         *         int n = in.nextInt();
         *         int m = in.nextInt();
         *         int max = Integer.MIN_VALUE;
         *
         *         for (int i = 0; i < n; i++) {
         *             int input = in.nextInt();
         *
         *             deque.add(input);
         *             set.add(input);
         *
         *             if (deque.size() == m) {
         *                 if (set.size() > max) max = set.size();
         *                 int first = deque.remove();
         *                 if (!deque.contains(first)) set.remove(first);
         *             }
         *         }
         *
         *         System.out.println(max);
         */
        int totalMax=0;
        int max=0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            int lastMax=max;
            if(deque.size()==0){
                deque.add(num);
                max++;
                continue;
            }
            if(m>deque.size()){
                if(deque.peek()!=num){
                    deque.add(num);
                    max++;
                }else{
                    max=lastMax;
                    deque.add(num);
                }
                if(max>totalMax)
                    totalMax=max;
            }else{
                deque.pop();
                if(deque.peek()!=num){
                    deque.add(num);
                    max=deque.size();
                }else{
                    max=lastMax;
                    deque.add(num);
                }
                if(max>totalMax)
                    totalMax=max;
            }
        }
        System.out.println(totalMax);
    }
}
