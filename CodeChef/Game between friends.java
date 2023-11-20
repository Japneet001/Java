/*  Nitin and Sobhagya were playing a game with coins. If Sobhagya has more coins then he is winning, otherwise Nitin is winning. Note that this means if both Nitin and Sobhagya have the same number of coins, then Nitin is winning.
    Initially Nitin has A coins while Sobhagya has B coins. Then Ritik came and gave his C coins to the player who is not winning currently, after which Satyarth came and repeated the same process (gave his D coins to the player who is not winning currently).

    Find the final winner of the game. 
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
        int arr[] = new int[4];
        for (int i = 0; i < T; i++) {
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            arr[3] = sc.nextInt();
            int A = arr[0];
            int B = arr[1];
            int C = arr[2];
            int D = arr[3];
            if (A < B) {
                A += C;
            } else {
                B += C;
            }
            if (A < B) {
                A += D;
            } else {
                B += D;
            }
            if (A < B) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
        sc.close();

    }
}
