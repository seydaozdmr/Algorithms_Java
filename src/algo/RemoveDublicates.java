package src.algo;

import java.util.HashMap;
import java.util.Map;

public class RemoveDublicates {
    private static int[] removeDublicate(int [] arr){
        Map<Integer,Integer> mapOfNums=new HashMap<>();
        for(int i=0;i<arr.length;i++){
//            if(mapOfNums.containsKey(arr[i]))
//                mapOfNums.put(arr[i],mapOfNums.get(arr[i])+1);
//            else
//                mapOfNums.put(arr[i],1);
            mapOfNums.merge(arr[i],1,Integer::sum);
        }
        int [] result =new int[mapOfNums.keySet().size()];
        int i=0;
        for(Integer elem:mapOfNums.keySet()){
            result[i++]=elem;
        }
        return result;
    }

    public static void main(String[] args) {
        int[]elems={1,2,3,4,4,5,5,5,1,2,3,7};
        int[] result=removeDublicate(elems);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
