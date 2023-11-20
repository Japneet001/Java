/* Devendra just had a million-dollar idea and he needs funds to startup. He was recently invited to Sasta Shark Tank (A TV show where entrepreneurs pitch their ideas to investors hoping to get investment in return).

He was offered deals from two investors. The first investor offers A dollars for 10% of his company and the second investor offers B dollars for 20% of his company. Devendra will accept the offer from the investor whose valuation of the company is more. Determine which offer will Devendra accept or if both the offers are equally good.

For example, if the first investor offers 300 dollars for 10% of the company, then the first investor's valuation of the company is 3000 dollars since 10% of 3000 = 300
If the second investor offers 500 dollars for 20% of the company, then the second investor's valuation of the company is 2500 dollars since 20% of 2500 = 500 */

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
            int A = arr[0];
            int B = arr[1];
            if (10 * A > 5 * B) {
                System.out.println("FIRST");
            } else if (10 * A < 5 * B) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }
        sc.close();

    }
}
