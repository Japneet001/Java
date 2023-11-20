/*  One less problem without ya
    I got one less problem without ya

    Alice and Bob are competing in a challenge. Initially Alice has N problems and Bob has M problems.
        Each time Alice solves a problem, Bob receives one more problem to solve.
        Each time Bob solves a problem, Alice receives three more problems to solve.
    Find whether it is possible that both of them have the same number of problems left if they can solve the problems in any arbitrary manner. 
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
            int N = sc.nextInt(); // Alice
            int M = sc.nextInt(); // Bob
            int difference = Math.abs(N - M);
            if (difference % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
