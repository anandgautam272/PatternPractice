import java.lang.*;
import java.util.*;

/********

 **********
 ****  ****
 ***    ***
 **      **
 *        *

 ********/
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int spaces=0;
        int stars=n;
        for(int i=1;i<=n;i++){
            stars=stars;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            spaces = spaces;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            spaces=spaces+2;
            stars--;
        }
    }
}