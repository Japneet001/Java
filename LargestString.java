//For a given set of Strings, print the largest string based on Lexicographic order.
// Lexicographic order: check each character, which has less ASCII value will be small.

import java.util.Scanner;

public class LargestString {
    public static String largeststring(String arr[]) {
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest.compareToIgnoreCase(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        String arr[] = new String[size];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        sc.close();
        String answer = largeststring(arr);
        System.out.println("Largest string is: " + answer);
    }
}
