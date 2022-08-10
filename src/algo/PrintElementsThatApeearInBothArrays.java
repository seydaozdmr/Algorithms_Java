package src.algo;

public class PrintElementsThatApeearInBothArrays {
    private static void printElementsThatAppearInBothArrays(int [] arr1,int [] arr2){
        int array1Index=0;
        int array2Index=0;
        Integer recentMatchedValue=null;

        while (array1Index <arr1.length && array2Index < arr2.length){
            if(arr1[array1Index] < arr2[array2Index])
                array1Index++;
            else if (arr2[array2Index] < arr1[array1Index])
                array2Index++;
            else{
                if(recentMatchedValue == null || recentMatchedValue != arr1[array1Index]){
                    System.out.print(arr1[array1Index]+ " ");
                    recentMatchedValue=arr1[array1Index];
                }
                array1Index++;
                array2Index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = { 0, 1, 2, 2, 5, 6, 6, 8, 25, 25 };
        int[] array2 = { -2, 0, 1, 2, 2, 2, 3, 4, 5, 10, 20, 25, 25 };

        System.out.println("Elements: ");
        printElementsThatAppearInBothArrays(array1, array2);
    }
}
