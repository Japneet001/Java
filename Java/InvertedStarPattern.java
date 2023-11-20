/* Inverted Star Pattern
Example: for n=4;
            ****
            ***
            **
            *

*/


import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
