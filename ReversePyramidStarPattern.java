Code to print Reversed Pyramid Star Pattern in Java
Input : n = 5
Output :   * * * * *
            * * * *
             * * *
              * *
               *

CODE :
import java.util.*;
class ReversePyramidStarPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
