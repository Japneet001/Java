/* Chef is fond of burgers and decided to make as many burgers as possible.
Chef has A patties and B buns. To make 1 burger, Chef needs 1 patty and 1 bun.
Find the maximum number of burgers that Chef can make.
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
            System.out.println(Math.min(A, B));
        }
        sc.close();

    }
}
