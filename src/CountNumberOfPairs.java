package src;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfPairs {

    private static int countNumberOfPairs(int[] values){
        Map<Integer,Integer> valuesMap=new HashMap<>();
        int equalsNumberCount = 0;

        for(int i=0;i<values.length;i++){
            int count=0;
            if(valuesMap.containsKey(values[i]))
                count=valuesMap.get(values[i]);
            count++;
            valuesMap.put(values[i],count);
        }

        for(int numberKey:valuesMap.keySet()){
            if(valuesMap.get(numberKey)>1){
                int n=valuesMap.get(numberKey);
                equalsNumberCount+=(n-1)*n/2;
            }
        }

        return equalsNumberCount;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,5,2,1,2,3,4,5,6,6,6,7,6,6,7,4,3,2,5,7};
        System.out.println(countNumberOfPairs(arr));
    }
}
