package src.algo;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            char[] ca = a.toCharArray();
            char[] ba = b.toCharArray();
            Arrays.parallelSort(ca);
            Arrays.parallelSort(ba);
            return Arrays.equals(ba, ca);
        }
    }

    public static boolean isAnagram2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            int[] contarr = new int[29];

            int j;
            for(j = 0; j < str1.length(); ++j) {
                ++contarr[str1.charAt(j) - 97];
                --contarr[str2.charAt(j) - 97];
            }

            for(j = 0; j < contarr.length; ++j) {
                if (contarr[j] != 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {

        System.out.println(isAnagram2("seyda","aysed"));
    }
}
