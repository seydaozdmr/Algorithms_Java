package src.HackerRank;

import java.util.Scanner;

public class ArrayGame {
    public static boolean canWin(int leap, int[] game) {

        for(int i=0;i<game.length-1;i++){
            if(i==game.length-1)
                return true;
            if(game[i+1]==0)
                continue;

            else if(game[i+1]==1) {
                int tempLeap = i + leap;
                if (tempLeap > game.length-1)
                    return true;
                if (game[i + leap] == 0) {
                    i = i + leap;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
