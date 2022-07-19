package src;

import java.util.Arrays;

public class ClosestPair {

    private static double[] closestPair(double [] arr){
        double [] closestPair = new double[2];

        double currentMinimumDifference = Double.MAX_VALUE;

        Arrays.sort(arr);

        for(int i = 0; i<arr.length -1 ;i++){
            if(Math.abs(arr[i] -arr[i+1])<currentMinimumDifference){
                currentMinimumDifference=Math.abs(arr[i] -arr[i+1]);

                closestPair[0] = arr[i];
                closestPair[1] = arr[i+1];
            }
        }
        return closestPair;
    }

    public static void main(String[] args) {
        double[] array1 = {-5.2, 9.4, 20, -10, 21.1, 40, 50, -20};
        double[] array2 = {-4, -3, 0, 10, 20};
        double[] array3 = {-10, -3, 0, 2, 4, 20};

        double[] closestPair1 = closestPair(array1);
        double[] closestPair2 = closestPair(array2);
        double[] closestPair3 = closestPair(array3);

        System.out.println("Closest pair: " + closestPair1[0] + " " + closestPair1[1] + " Expected: 20.0 21.1");
        System.out.println("Closest pair: " + closestPair2[0] + " " + closestPair2[1] + " Expected: -4.0 -3.0");
        System.out.println("Closest pair: " + closestPair3[0] + " " + closestPair3[1] + " Expected: 0.0 2.0");
    }
}
