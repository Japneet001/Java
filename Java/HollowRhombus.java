/* Hollow Rhombus Pattern
For Example: for n=5
            *****
           *   *
          *   *
         *   *
        *****
*/

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // hollow rectangle - stars
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
