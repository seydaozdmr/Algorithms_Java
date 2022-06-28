package src.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Hourglass {
    public static void main(String[] args) {


        List<List<Integer>> arr = new ArrayList<>();

        arr.add(List.of(-1 ,-1 ,0 ,-9, -2, -2));
        arr.add(List.of(-2 ,-1 ,-6 ,-8 ,-2 ,-5));
        arr.add(List.of(-1 ,-1 ,-1 ,-2 ,-3 ,-4));
        arr.add(List.of(-1 ,-9 ,-2 ,-4 ,-4 ,-5));
        arr.add(List.of(-7 ,-3 ,-3 ,-2 ,-9 ,-9));
        arr.add(List.of(-1 ,-3 ,-1 ,-2 ,-4 ,-5));
        int max=0;
        int minMax=Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            for(int k=0;k<4;k++){
                int sayac=0;
                int toplam=0;
                for(int j=i;j<i+3;j++){
                    List<Integer> satir=arr.get(j);
                    if(sayac==0){
                        toplam=satir.get(k)+satir.get(k+1)+satir.get(k+2);
                        sayac++;
                    }else if(sayac==1){
                        toplam+=satir.get(k+1);
                        sayac++;
                    }else{
                        toplam+=satir.get(k)+satir.get(k+1)+satir.get(k+2);
                        sayac++;
                    }
                    //System.out.println(toplam);

                }
                if(toplam>=max)
                    max=toplam;
                if(toplam>minMax)
                    minMax=toplam;
            }
        }


        if(minMax>Integer.MIN_VALUE)
            System.out.println(minMax);
        else
            System.out.println(max);

    }

}
