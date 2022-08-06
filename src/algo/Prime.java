package src.algo;

public class Prime {
    private static boolean isPrime(int i){
        for(int k=2;(double) k <Math.sqrt(i);k++){
            if(i%k==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
}
