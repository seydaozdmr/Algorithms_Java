package src.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDublicateElementsArray {
    private static void removeDublicates(int [] arr){
        Arrays.sort(arr);

        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1])
                arr[j++]=arr[i];
        }
        arr[j++] = arr[arr.length - 1];

        for(int i = 0; i < j; ++i) {
            System.out.println(arr[i]);
        }

    }

    public static void remove2(int[] arr) {
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < arr.length; ++i) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], (Integer)map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        map.forEach((k, v) -> {
            System.out.println(k);
        });
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 6, 4, 4, 5,6};
        removeDublicates(arr);
    }
}
