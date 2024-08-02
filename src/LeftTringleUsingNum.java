import java.util.Scanner;
/*******
  1 2 3 4 5
  1 2 3 4
  1 2 3
  1 2
  1
*****/
public class LeftTringleUsingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printLeftTringle(num);
    }
    public static void printLeftTringle(int n){
       int decrese = 0;
        for(int row=1;row<=n;row++){
           decrese=decrese;
            for(int col=1;col<=n-decrese;col++){
                System.out.print(col+" ");
            }
            System.out.println();
            decrese++;
        }
    }
}
