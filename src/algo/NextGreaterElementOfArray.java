package src.algo;

import src.datastructures.linkedlist.LinkedList;

import java.util.Stack;

public class NextGreaterElementOfArray {

    public static void nextGreater(int[] arr){
        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(linkedList.size()==0)
                linkedList.addHeadOfTheList(arr[i]);
            int last=linkedList.removeFirstItemFromList();
            if(last<arr[i]){
                linkedList.addHeadOfTheList(arr[i]);
                System.out.println("this is the next greather -> "+arr[i]);
            }else{
                linkedList.addHeadOfTheList(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 10, 5, 14, 1};
        nextGreater(arr);
        System.out.println();
    }
}
