package src;

public class FarthestPair {

    private static double[] farthestPair(double [] arr){
        double [] result = new double[2];

        if(arr.length==0)
            throw new RuntimeException("Dizi boş olmamalı");

        double currentMin=arr[0];
        double currentMax=arr[0];

        result[0]=arr[0];
        result[1]=arr[1];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<currentMin){
                currentMin=arr[i];
                result[0]=arr[i];
            }
            if(arr[i]>currentMax){
                currentMax=arr[i];
                result[1]=arr[i];
            }
        }
        return result;
    }
}
