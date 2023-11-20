/*  Chef has three spells. Their powers are A, B and C respectively. Initially, Chef has 0 hit points, and if he uses a spell with power P, then his number of hit points increases by P.
    Before going to sleep, Chef wants to use exactly two spells out of these three. Find the maximum number of hit points Chef can have after using the spells. 
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
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int max1 = Math.max(A + B, A + C);
            int answer = Math.max(max1, B + C);
            System.out.println(answer);
        }
    }
}
