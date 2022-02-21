package src.java.com.seydaozdemir.examples;

import java.math.BigInteger;

public class ThreeSum {
    public static int threeSum(int [] arr) {
        int length=arr.length;
        int count=0;
        //çok büyük sayılarda integer limitlerinin taşmasını engellemek için BigInteger kullanıyoruz.

        BigInteger biginteger;

        for(int i=0;i<length;i++) {
            for(int j=i+1;j<length;j++) {
                for(int k=j+1;k<length;k++) {
                    biginteger=BigInteger.valueOf(i);
                    biginteger=biginteger.add(BigInteger.valueOf(j));
                    biginteger=biginteger.add(BigInteger.valueOf(k));

                    if(biginteger.intValue()==0) {
                        count++;
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] array = in.readAllInts();
        StdOut.println(threeSum(array));

    }
}
