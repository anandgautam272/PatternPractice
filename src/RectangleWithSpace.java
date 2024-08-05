import java.util.Scanner;

/**
 ******
 *    *
 *    *
 *    *
 ******

 **/
public class RectangleWithSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int preventloop = 0;
        for(int row = 1; row <= n+1; row++) {
            if (preventloop == 0) {
                for (int col = 1; col <= n; col++) {
                    System.out.print("*");
                }
            }
            if (preventloop > 1 && preventloop<=n-1) {
                for (int col = 1; col <= n; col++) {
                    if (col == 1 || col == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            if (preventloop == n) {
                for (int col = 1; col <= n ; col++) {
                    System.out.print("*");
                }
            }
            preventloop++;
            if (preventloop > 1){
                System.out.println();
          }
        }
    }
}
