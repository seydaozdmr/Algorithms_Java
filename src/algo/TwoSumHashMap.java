package src.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    private static int [] twoSum(int []arr,int key){
        Map<Integer, Integer> map = new HashMap();
        int i;
        for(i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(i=0;i<arr.length;i++){
            int numToFind=key-arr[i];
            if (map.containsKey(numToFind) && (Integer)map.get(numToFind) != i) {
                return new int[]{i, (Integer)map.get(numToFind)};
            }
        }
        throw new IllegalArgumentException("Aradığınız toplam çifti bulunamadı.");
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 18;
        System.out.println("HashMap yöntemi ile: " + Arrays.toString(twoSum(arr, target)));
    }
}
