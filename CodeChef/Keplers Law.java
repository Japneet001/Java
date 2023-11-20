/*  Kepler’s Law states that the planets move around the sun in elliptical orbits with the sun at one focus. Kepler's 3rd law is The Law of Periods, according to which:
        The square of the time period of the planet is directly proportional to the cube of the semimajor axis of its orbit.
    You are given the Time periods (T1,T2) and Semimajor Axes (R1,R2) of two planets orbiting the same star.
    Please determine if the Law of Periods is satisfied or not, i.e, if the constant of proportionality of both planets is the same.
    Print "Yes" (without quotes) if the law is satisfied, else print "No". 
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
            int T1 = arr[0];
            int T2 = arr[1];
            int R1 = arr[2];
            int R2 = arr[3];
            float const1 = (float) (T1 * T1) / (R1 * R1 * R1);
            float const2 = (float) (T2 * T2) / (R2 * R2 * R2);
            if (const1 == const2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();

    }
}
