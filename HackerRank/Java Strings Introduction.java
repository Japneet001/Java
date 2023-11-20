/* Given two strings of lowercase English letters, A and B, perform the following operations:
    Sum the lengths of A and B.
    Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
    Capitalize the first letter in A and B and print them on a single line, separated by a space.

Input Format:
    The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

Output Format:

    There are three lines of output:
    For the first line, sum the lengths of A and B.
    For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
    For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space. 
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length()); // sum of lengths

        // Determine if A is lexicographically larger than B.
        if (A.compareToIgnoreCase(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Capitalize the first letter in A and B
        String sA1 = A.substring(0, 1).toUpperCase();
        String sA2 = A.substring(1);
        String Aresult = sA1 + sA2;

        String sB1 = B.substring(0, 1).toUpperCase();
        String sB2 = B.substring(1);
        String Bresult = sB1 + sB2;

        System.out.println(Aresult + " " + Bresult);
    }
}
