/* Task: 
    Given an integer, , perform the following conditional actions:

    If  is odd, print Weird
    If  is even and in the inclusive range of  to , print Not Weird
    If  is even and in the inclusive range of  to , print Weird
    If  is even and greater than , print Not Weird
    Complete the stub code provided in your editor to print whether or not  is weird.

Input Format:
    A single line containing a positive integer, .

Constraints:
    1<=n<=100

Output Format:
    Print Weird if the number is weird; otherwise, print Not Weird. 
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if (N % 2 != 0) {
            System.out.print("Weird");
        } else {
            if (2 <= N && N <= 5) {
                System.out.print("Not Weird");
            } else if (6 <= N && N <= 20) {
                System.out.print("Weird");
            } else {
                System.out.print("Not Weird");
            }
        }
    }
}
