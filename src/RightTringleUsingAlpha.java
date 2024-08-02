import java.util.Scanner;
/*****
 A
 B B
 C C C
 D D D D
 E E E E E
 F F F F F F

 * *****/
public class RightTringleUsingAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRightTringle(n);
    }
    public static void printRightTringle(int n){
        int a=65;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print((char)(a)+" ");
            }
            System.out.println();
            a++;
        }
    }
}
