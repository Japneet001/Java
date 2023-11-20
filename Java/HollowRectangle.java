/* Hollow Rectangle Pattern
For example: for rows=4 and columns=5
                    *****
                    *   *
                    *   *
                    *****
*/


import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int col = sc.nextInt();
        sc.close();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == rows - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == col - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
