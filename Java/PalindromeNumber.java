// Given an integer x, return true if x is a palindrome, and false otherwise.

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int n = x;
        int palindrome = 0;
        while (x > 0) {
            int rem = x % 10;
            palindrome = palindrome * 10 + rem;
            x = x / 10;
        }
        if (palindrome == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        sc.close();
        boolean result = isPalindrome(num);
        if (result) {
            System.out.println(num + " is a Palindrome Number.");
        } else {
            System.out.println(num + " is not a Palindrome Number.");
        }
    }
}
