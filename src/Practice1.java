import java.lang.*;
import java.util.*;

/*******

 *            *
 **          **
 ***        ***
 ****      ****
 *****    *****
 ******  ******
 **************

 *******/
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int spaces=n*2-2;
        int star=2;
        for(int i = 1;i<=n;i++){
            star=star;
            for(int j = 1;j<=star-1;j++){
                System.out.print("*");
            }
            spaces=spaces;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star-1;j++){
                System.out.print("*");
            }
            System.out.println();
            star++;
            spaces = spaces-2;

        }

    }

}