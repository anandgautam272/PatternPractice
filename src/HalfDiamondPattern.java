import java.lang.*;
import java.util.*;

/***
 *
 * *
 * * *
 * * * *
 * * *
 * *
 *
 * ****/

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHalfDiamond(n);
    }

    public static void printHalfDiamond(int n) {
        int pattern = 1;
        for (int row = 1; row <= n * 2 - 1; row++) {
            if (row <= n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int col = 1; col <= n - pattern; col++) {
                    System.out.print("*" + " ");
                }
                pattern++;
            }
            System.out.println();
        }
    }
}