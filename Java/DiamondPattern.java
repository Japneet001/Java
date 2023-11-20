/* Diamond Pattern
For example: for rows=4
                   *
                  ***
                 *****
                *******
                 *****
                  ***
                   *
                       
*/
import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int n=sc.nextInt();
        sc.close();
        //upper diamond
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars - left
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            //stars - right
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower diamond
        for(int i=0;i<n-1;i++){
            //spaces
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            //stars - left
            for(int j=n-i-1;j>0;j--){
                System.out.print("*");
            }
            //stars - right
            for(int j=n-i-2;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
