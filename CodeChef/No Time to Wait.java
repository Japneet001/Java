/*  Only x hours are left for the March Long Challenge and Chef is only left with the last problem unsolved. However, he is sure that he cannot solve the problem in the remaining time. From experience, he figures out that he needs exactly H hours to solve the problem.
    Now Chef finally decides to use his special power which he has gained through years of intense yoga. He can travel back in time when he concentrates. Specifically, his power allows him to travel to N different time zones, which are T1, T2,...,TN hours respectively behind his current time.
    Find out whether Chef can use one of the available time zones to solve the problem and submit it before the contest ends. 
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
        int N = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] + x >= H) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
