// Given an integer array nums, find the subarray with the largest sum, and return its sum.

class Solution {
    public int maxSubArray(int[] nums) {
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
}