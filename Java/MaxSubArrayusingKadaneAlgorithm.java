/* KADANE's ALGORITHM: An iterative dynamic programming algorithm. It calculates the maximum sum subarray ending at a particular position by using the maximum sum subarray ending at the previous position.
Time Complexity: O(n) as there are 1 nested loops running each with complexity n
*/

/* Not useful for array having all negative numbers. */

import java.util.Scanner;

public class MaxSubArrayusingKadaneAlgorithm {
    public static void subarray(int arr[]) {
        int Max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            Max_sum = Math.max(Max_sum, curr_sum);
        }
        System.out.println("Maximum sum is: " + Max_sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            int element = sc.nextInt();
            arr[i] = element;
        }
        sc.close();
        subarray(arr);
    }
}
