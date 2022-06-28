package src.HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        //TODO bunu tek bir array üzerinde yapabilir miyiz
        int [][] resultSetAB=new int[2][a.length()];
        for(int i=0;i<a.length();i++){
            for(int j=0;j<a.length();j++){
                if(a.toLowerCase().charAt(i)==b.toLowerCase().charAt(j)){
                    resultSetAB[1][i]+=1;
                }
            }
            for(int j=0;j<b.length();j++){
                if(a.toLowerCase().charAt(i)==a.toLowerCase().charAt(j)){
                    resultSetAB[0][i]+=1;
                }
            }
        }
        for(int i=0;i<a.length();i++){
            if(resultSetAB[0][i]!=resultSetAB[1][i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
        boolean ret = isAnagram("hello", "Hello");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
