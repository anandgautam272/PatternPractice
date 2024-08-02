import java.util.Scanner;
/****

 * * * *
 * * *
 * *
 *

 *****/
public class DownwardTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDownwardTringle(n);
    }
    public static  void printDownwardTringle(int n){
        int decrease =0;
        for(int row=1;row<=n;row++){
            for(int col=1;col<n-decrease;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
            decrease++;
        }
    }
}
