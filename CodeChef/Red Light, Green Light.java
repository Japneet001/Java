/* “You won’t get caught if you hide behind someone.”
   Sang-Woo advises Gi-Hun to hide behind someone to avoid getting shot.
   Gi-Hun follows Sang-Woo's advice and hides behind Ali, who saved his life earlier. Gi-Hun and Ali both have the same height, K. Many players saw this trick and also started hiding behind Ali.
   Now, there are N players standing between Gi-Hun and Ali in a straight line, with the ith player having height Hi. Gi-Hun wants to know the minimum number of players who need to get shot so that Ali is visible in his line of sight.

Note:
    Line of sight is a straight line drawn between the topmost point of two objects. Ali is visible to Gi-Hun if nobody between them crosses this line.
    Even if there are some players who have the same height as that of Gi-Hun and Ali, Ali will be visible in Gi-Hun's line of sight.
    Gi-Hun and Ali have the same height. 
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
            int N = arr[0];
            int K = arr[1];
            int count = 0;
            int height[] = new int[N];
            for (int j = 0; j < N; j++) {
                height[j] = sc.nextInt();
                if (height[j] > K) {
                    count += 1;
                }
            }
            System.out.println(count);
        }
        sc.close();

    }
}
