/*  PREFIX SUM: Each index of prefixSum array contains the sum of elements of the subarray that starts at the 0th index and ends at ith index.
    Time Complexity: O(n^2) as there are 2 nested loops running each with complexity n
*/

/*Print Maximum sum of Sub Array:
For example: arr = {1,2,3,4,5}
Sub Arrays will be:
                (1),(1,2),(1,2,3),(1,2,3,4),(1,2,3,4,5)
                (2),(2,3),(2,3,4),(2,3,4,5)
                (3),(3,4),(3,4,5)
                (4),(4,5)
                (5)
Sum of the given sub Arrays will be:
                (1) (3) (6) (10) (15)
                (2) (5) (9) (14)
                (3) (7) (12)
                (4) (9) 
                (5) 
Maximum sum will be: 15

*/

import java.util.*;

public class MaxSubArrayusingPrefixSum {
    public static void subarray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum: " + maxSum);
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
