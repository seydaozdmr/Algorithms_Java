package src.algo;

import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringPalindromStream {

    private static boolean isPalindrome(String s){
        return IntStream.range(0, s.length() / 2)
                .noneMatch(i -> s.charAt(i) != s.charAt(s.length() - i - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aka"));
        IntStream.range(0,10).forEach(System.out::println);
    }
}

