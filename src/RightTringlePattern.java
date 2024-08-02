import java.util.Scanner;

/****

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *


 ****/
public class RightTringlePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printRightTringle(num);
    }
    public static void printRightTringle(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
