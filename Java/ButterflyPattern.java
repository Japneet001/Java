/* Butterfly Pattern
For Example: for n=4
            *      *
            **    **
            ***  ***
            ********
            ********
            ***  ***
            **    **
            *      * 

*/

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        // for upper butterfly
        for (int i = 0; i < n; i++) {
            // for upper-left butterfly
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            // for upper-right butterfly
            for (int j = n; j > n - i - 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for lower butterfly
        for (int i = n; i > 0; i--) {
            // for lower-left butterfly
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // for lower-right butterfly
            for (int j = n; j > n - i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
