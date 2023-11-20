/*  Given a positive integer N, MoEngage wants you to determine if it is possible to rearrange the digits of N (in decimal representation) and obtain a multiple of 5.
    For example, when N=108, we can rearrange its digits to construct 180 = 36*5 which is a multiple of 5. 
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
            int temp = 0;
            int D = sc.nextInt();
            String N = sc.next();
            for (int j = 0; j < D; j++) {
                if (N.charAt(j) == '0' || N.charAt(j) == '5') {
                    temp = 1;
                    System.out.println("YES");
                    break;
                }
            }
            if (temp == 0) {
                System.out.println("NO");
            }
        }
    }
}
