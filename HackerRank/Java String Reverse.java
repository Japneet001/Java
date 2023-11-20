/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String temp = A;
        String B = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            B = B + A.charAt(i);
        }
        if (temp.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();

    }
}
