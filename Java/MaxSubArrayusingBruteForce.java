/*  BRUTE FORCE
    Time Complexity: O(n^3) as there are 3 nested loops running each with complexity n
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

public class MaxSubArrayusingBruteForce {
    public static void subarray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
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
            System.out.print("Enter " + i + "th element of the array: ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        System.out.print("Given array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
        subarray(arr);

    }

}
