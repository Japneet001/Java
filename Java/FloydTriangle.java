/* Floyd Triangle Pattern
For example: for rows=4
                1
                2 3
                4 5 6
                7 8 9 10

*/

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();
        sc.close();
        int num = 1;
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j<i+1; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

}
