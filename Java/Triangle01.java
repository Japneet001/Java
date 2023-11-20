/* Inverted Half Pyramid with Numbers Pattern
For example: for rows=4
                1
                0 1
                1 0 1
                0 1 0 1

*/

import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rows=sc.nextInt();
        sc.close();
        for (int i=0;i<rows;i++){
            for (int j=0;j<i+1;j++){
                if ((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
