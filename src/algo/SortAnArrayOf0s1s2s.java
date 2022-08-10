package src.algo;

public class SortAnArrayOf0s1s2s {

    private static int [] sort(int[]arr){
        int[] countArr=new int[3];
        for(int i=0;i<arr.length;i++){
            ++countArr[arr[i]];
        }

        int[]temp=new int[arr.length];
        int j = 0,i=0;
        while(i<arr.length){
            if(countArr[j]==0)
                j++;
            else{
                temp[i]=j;
                countArr[j]--;
                i++;
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 0, 1, 0, 0,2,2, 1, 0,2, 1, 0, 0};
        int[] newArr = sort(arr);
        int[] var6 = newArr;
        int var5 = newArr.length;

        for(int var4 = 0; var4 < var5; ++var4) {
            int i = var6[var4];
            System.out.println(i);
        }

    }
}
