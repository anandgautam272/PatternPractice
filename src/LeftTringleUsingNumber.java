import java.util.Scanner;

public class LeftTringleUsingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printLeftTringle(num);
    }
    public static void printLeftTringle(int n){
       int space=1;
       int sp=0;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n*2-space;col++){
                System.out.print(" ");
            }
            sp=sp;
            for(int col=1;col<=row+sp;col++){
                if(col%2!=0){
                    System.out.print(col);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            space+=2;
            sp++;
        }
    }
}
