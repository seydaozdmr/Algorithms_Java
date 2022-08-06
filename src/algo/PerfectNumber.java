package src.algo;

public class PerfectNumber {
    private static void perfectNumber(int i){
        int sum=0;
        int temp=i;
        int c=1;
        while(temp>1){
            if(temp%c==0){
                sum+=c;
                temp=temp/c;
            }
            c++;
        }
        if(sum==i)
            System.out.println("perfect");
        else
            System.out.println("not perfect");

    }

    public static void main(String[] args) {
        perfectNumber(6);
    }
}
