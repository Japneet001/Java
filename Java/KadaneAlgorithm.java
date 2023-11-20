/* Updated Kadane's Algorithm: for arrays containing only negative integers also
  Given an integer array nums, find the subarray with the largest sum, and return its sum.
*/

import java.util.Scanner;

class KadaneAlgorithm {
    public static int maxSubArray(int[] nums) {
        int Max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                count += 1;
            }
        }
        if (count == nums.length) {
            int Max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > Max) {
                    Max = nums[i];
                }
            }
            Max_sum = Max;
        } else {
            for (int i = 0; i < nums.length; i++) {
                curr_sum += nums[i];
                if (curr_sum < 0) {
                    curr_sum = 0;
                }
                Max_sum = Math.max(Max_sum, curr_sum);
            }
        }

        return Max_sum;

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
        int sum = maxSubArray(arr);
        System.out.println(sum);
    }
}