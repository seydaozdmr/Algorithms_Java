package src.algo;

public class DigitSumRecursion {

    private static int digitSum(int n){
        if(n<=0)
            return 0;
        else{
            int i=n%10;
            n/=10;
            return digitSum(n)+i;
        }
    }

    public static void main(String[] args) {
        System.out.println(digitSum(12345));
    }
}
