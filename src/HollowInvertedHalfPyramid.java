import java.util.Scanner;

/***
 ******
 *   *
 *  *
 * *
 **
 *
 * ***/
public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHollowInvertedHalfPyramid(n);
    }

    public static void printHollowInvertedHalfPyramid(int n) {
        int dec = 0;
        for (int row = 1; row <= n; row++) {
           if(dec<=0){
            for (int col = 1; col <= n; col++) {
                    System.out.print("*");
                }
           }else {
               for (int col = 1; col <=n-dec;col++){
                   if(col == 1 || col == n-dec){
                       System.out.print("*");
                   }else {
                       System.out.print(" ");
                   }
               }
           }
            System.out.println();
            dec++;
            }

        }
    }

