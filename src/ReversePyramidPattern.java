import java.util.Scanner;

public class ReversePyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printReversePyramid(n);
    }
    public static  void printReversePyramid(int n){
       int space =0;
        for(int row=1;row<=n;row++){
           space=space;
            for(int col=1;col<=space;col++){
                System.out.print(" ");
            }

            for(int col=1;col<=n-space;col++){
                System.out.print("*"+" ");
            }


            System.out.println();
            space++;
        }
    }
}
