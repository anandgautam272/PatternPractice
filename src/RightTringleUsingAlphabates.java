import javax.xml.transform.Source;
import java.util.Scanner;
/*****
 A
 A B
 A B C
 A B C D
 A B C D E

 * *****/
public class RightTringleUsingAlphabates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRightTringle(n);
    }
    public static void printRightTringle(int n){
        int a=64;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print((char)(a+col)+" ");
            }
            System.out.println();
        }
    }
}
