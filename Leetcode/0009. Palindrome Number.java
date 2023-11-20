// Given an integer x, return true if x is a palindrome, and false otherwise.

class Solution {
    public boolean isPalindrome(int x) {
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
}
