import java.util.Scanner;
/****
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 ****/
public class RightTringleUsingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printRightTringle(num);
    }
    public static void printRightTringle(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
