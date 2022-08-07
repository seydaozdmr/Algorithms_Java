package src.algo;

public class Segregate0s1s {

    public static void main(String[] args) {
        int[]arr={1,1,0,0,1,1,1,0,0,0,1,0,1,0};
        segregate(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void segregate(int [] arr){
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                arr[j++]=0;
        }

        while(j<arr.length){
            arr[j++]=1;
        }
    }
}
