/*Chef's son Chefu found some matches in the kitchen and he immediately starting playing with them.

The first thing Chefu wanted to do was to calculate the result of his homework — the sum of A and B, and write it using matches. Help Chefu and tell him the number of matches needed to write the result.
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[] = new int[2];
        for (int i = 0; i < T; i++) {
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            int A = arr[0];
            int B = arr[1];
            int sum = A + B;
            int count = 0;
            while (sum > 0) {
                int digit = sum % 10;
                if (digit == 0 || digit == 6 || digit == 9) {
                    count += 6;
                } else if (digit == 1) {
                    count += 2;
                } else if (digit == 2 || digit == 3 || digit == 5) {
                    count += 5;
                } else if (digit == 4) {
                    count += 4;
                } else if (digit == 7) {
                    count += 3;
                } else {
                    count += 7;
                }
                sum = sum / 10;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
