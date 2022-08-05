package src.algo;

public class MoveAllZerosToEnd {
    public static void moveZeros(int [] arr){
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr[count]=arr[i];
                count++;
            }

        }
        for(int i=count;i<arr.length;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        int[]arr= {1,0,6,3,0,2,0,0,2,5,6};
        moveZeros(arr);
        for(int i:arr) {
            System.out.print(i+" ->");
        }

    }
}
