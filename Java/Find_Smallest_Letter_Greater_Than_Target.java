/* You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

*/

import java.util.Scanner;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static char nextGreatestLetter(char[] letters, char target) {
        char result = 'a';
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                result = letters[i];
                break;
            } else {
                result = letters[0];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        char letters[] = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th element: ");
            String str = sc.next();
            char ch = str.charAt(0);
            letters[i] = ch;
        }
        System.out.print("Enter Target Letter: ");
        String targetString = sc.next();
        char target = targetString.charAt(0);
        char ans = nextGreatestLetter(letters, target);
        System.out.println("Smallest Letter greater than Target in the given array is: " + ans);
        sc.close();
    }
}