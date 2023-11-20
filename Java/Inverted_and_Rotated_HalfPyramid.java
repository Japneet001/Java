/* Inverted and Rotated Half Pyramid Pattern
For example: for rows=4
                       *
                      **
                     ***
                    ****
*/

import java.util.Scanner;

public class Inverted_and_Rotated_HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();
        sc.close();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
