/*  Alice has an array of N integers — A1, A2,....,An. She wants the product of all the elements of the array to be a non-negative integer. That is, it can be either 0 or positive. But she doesn't want it to be negative.
    To do this, she is willing to remove some elements of the array. Determine the minimum number of elements that she will have to remove to make the product of the array's elements non-negative. 
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
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int nums[] = new int[N];
            int count = 0;
            // formation of array
            for (int j = 0; j < N; j++) {
                nums[j] = sc.nextInt();
                if (nums[j] < 0) {
                    count++;
                }
            }
            for (int j = 0; j < N; j++) {
                if (nums[j] == 0) {
                    count = 0;
                }
            }
            if (count % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
        // your code goes here
    }
}
