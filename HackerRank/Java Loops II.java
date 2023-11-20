/* We use the integers b,b and n to create the following series:
    (a + 2^0.b), (a + 2^0.b + 2^1.b),.....(a + 2^0.b + 2^1.b + ... +2^(n-1).b)
You are given q queries in the form of a,b and n. For each query, print the series corresponding to the given a,b and n values as a single line of n space-separated integers.

Input Format: 
    The first line contains an integer,q, denoting the number of queries.
    Each line i of the q subsequent lines contains three space-separated integers describing the respective ai, bi and ni values for that query.

Constraints:
    0<=q<=500
    0<=a,b<=50
    0<=n<=15

Output Format:
    For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers. 
*/

import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int A = a + b;
            int j = 0;
            while (j < n) {
                System.out.print(A + " ");
                j++;
                A += Math.pow(2, j) * b;
            }
            System.out.println();
        }
        in.close();
    }
}
