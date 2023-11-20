/* Palindromic Pattern using Numbers
For Example: for n=5
                1
               212
              32123
             4321234
            543212345
*/

import java.util.Scanner;

public class PalindromicPattern_usingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();
        sc.close();
        for (int i = 0; i < rows; i++) {
            // spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // left
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j);
            }
            // right
            for (int j = 2; j < i + 2; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
