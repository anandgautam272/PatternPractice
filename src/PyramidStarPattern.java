import java.util.Scanner;

/*****
     *
    * *
   * * *
  * * * *
 * * * * *

 *****/
public class PyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printPyramid(num);
    }
    public static  void printPyramid(int n){
        int space=1;
        for(int row=1;row<=n;row++){
           space=space;
            for(int col=1;col<=n-space;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
            space++;
        }
    }
}
