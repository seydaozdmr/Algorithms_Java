package src.HackerRank;

import java.math.BigInteger;

public class PrimeExample {

    public static void main(String[] args) {
        String n = "2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251982";

        BigInteger result=new BigInteger(n);
        if(result.compareTo(BigInteger.ONE)>0){
            if(result.isProbablePrime(1) && n.length()<=100){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }else{
            System.out.println("not prime");
        }
    }

}
