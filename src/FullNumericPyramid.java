import java.lang.*;
import java.util.*;
/***
 0 0 0 0 5 0 0 0 0
 0 0 0 4 8 12 0 0 0
 0 0 3 6 9 12 15 0 0
 0 2 4 6 8 10 12 14 0
 1 2 3 4 5 6 7 8 9

 ***/
public class FullNumericPyramid {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFullNumericPyramid(n);
    }
    public static void printFullNumericPyramid(int n){
       int printNum = 1;
        int add =  0;
        int pattern = n;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col<=n-printNum;col++){
                    System.out.print(0+" ");
            }

            for (int col =1;col<=row+add;col++){
                System.out.print(pattern*col+" ");
            }
            for(int col = 1; col<=n-printNum;col++){
                System.out.print(0+" ");
            }


            printNum+=1;
            add++;
            pattern--;
            System.out.println();
        }
    }
}