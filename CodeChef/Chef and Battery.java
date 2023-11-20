/*  Chef's phone has a battery level of N percent.
    Each minute:
        If the phone is on charging, the battery level increases by 2%.
        Otherwise, the battery level decreases by 3%.
    Find the minimum time in which Chef can make the battery level reach exactly 50%.
    Note that the battery level should always lie in the range 0 to 100 (both included). 
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
            int N = sc.nextInt();
            int time = 0;
            while (N != 50) {
                if (N < 50) {
                    time++;
                    N += 2;
                } else {
                    time++;
                    N -= 3;
                }
            }
            System.out.println(time);
        }
    }
}
