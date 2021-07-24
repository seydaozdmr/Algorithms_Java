package src.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<6;i++){
            arr.add(new ArrayList<>());
        }
        arr.get(0).add(2);
        arr.get(0).add(5);
        arr.get(1).add(1);
        arr.get(1).add(0);
        arr.get(1).add(5);
        arr.get(2).add(1);
        arr.get(2).add(1);
        arr.get(2).add(7);
        arr.get(3).add(1);
        arr.get(3).add(0);
        arr.get(3).add(3);
        arr.get(4).add(2);
        arr.get(4).add(1);
        arr.get(4).add(0);
        arr.get(5).add(2);
        arr.get(5).add(1);
        arr.get(5).add(1);

        dynamicArray(2,arr);
    }
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> answers=new ArrayList<>();
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList());
        }

        int lastAnswer=0;
        for(int i=0; i<queries.size();i++){
            List<Integer> liste=queries.get(i);
            if(liste.size()==3){
                int idx=0;
                if(liste.get(0)==1){
                    idx = (liste.get(1)^lastAnswer) % n;
                    arr.get(idx).add(liste.get(2));
                }else if(liste.get(0)==2){
                    idx = (liste.get(1)^lastAnswer) % n;
                    lastAnswer=arr.get(idx).get(liste.get(2) % arr.get(idx).size());
                    if(lastAnswer!=0){
                        answers.add(lastAnswer);
                        System.out.println(lastAnswer);
                    }
                }
            }

        }
        return answers;

    }

}
