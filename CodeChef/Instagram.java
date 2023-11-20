/* Chef categorises an instagram account as spam, if, the following count of the account is more than 10 times the count of followers.

Given the following and follower count of an account as X and Y respectively, find whether it is a spam account.
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[] = new int[2];
        for (int i = 0; i < T; i++) {
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            int X = arr[0];
            int Y = arr[1];
            if (X > 10 * Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
