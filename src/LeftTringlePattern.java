import java.util.Scanner;

/****
         *
       * *
     * * *
   * * * *
 * * * * *


 ****/

public class LeftTringlePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printRightTringle(num);
    }
    public static void printRightTringle(int n){
       int space = 1;
       int sp = 0;
        for(int row=1;row<=n;row++){
            space = space;
            for(int col=1;col<=n*2-space;col++){
                System.out.print(" ");
            }
            sp= sp;
            for(int col=1;col<=row+sp;col++){
                if(col%2!=0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            space+=2;
            sp++;
        }
    }
}

