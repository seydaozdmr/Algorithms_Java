package src.algo;

import java.util.Arrays;

public class SelectionSort {

    private static void sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            int j;
            for(j=i+1; j<arr.length;j++){
                if(arr[min]>arr[j])
                    min=j;
            }
            //o anda hangi elemandaysak onu seçiyoruz
            j=arr[i];
            //seçilen eleman bulunan en küçük elemanla yer değiştiriyor.
            arr[i]=arr[min];
            arr[min]=j;
        }
    }

    public static void main(String[] args) {
        int[] arr={5,2,9,7,8,2,3,1};
        /**
         * 1,2,9,7,8,2,3,5
         * 1,2,2,7,8,9,3,5
         * 1,2,2,3,8,9,7,5
         * 1,2,2,3,5,9,7,8
         * 1,2,2,3,5,7,9,8
         * 1,2,2,3,5,7,8,9
         */
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
