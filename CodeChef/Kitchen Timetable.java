/*  There are N students living in the dormitory of Berland State University. Each of them sometimes wants to use the kitchen, so the head of the dormitory came up with a timetable for kitchen's usage in order to avoid the conflicts:
        The first student starts to use the kitchen at the time 0 and should finish the cooking not later than at the time A1.
        The second student starts to use the kitchen at the time A1 and should finish the cooking not later than at the time A2.
        And so on.
        The N-th student starts to use the kitchen at the time AN-1 and should finish the cooking not later than at the time AN

    The holidays in Berland are approaching, so today each of these N students wants to cook some pancakes. The i-th student needs Bi units of time to cook.
    The students have understood that probably not all of them will be able to cook everything they want. 
    How many students will be able to cook without violating the schedule? 
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
            int arr[] = new int[N];
            int reqtime[] = new int[N];
            int timehave[] = new int[N];
            int count = 0;
            for (int m = 0; m < N; m++) {
                arr[m] = sc.nextInt();
            }
            for (int j = 0; j < N; j++) {
                reqtime[j] = sc.nextInt();
            }
            timehave[0] = arr[0];
            for (int k = 1; k < N; k++) {
                timehave[k] = arr[k] - arr[k - 1];
            }
            for (int num = 0; num < N; num++) {
                if (timehave[num] >= reqtime[num]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();

    }
}
