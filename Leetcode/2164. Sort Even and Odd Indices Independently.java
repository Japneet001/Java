/*  You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:
        Sort the values at odd indices of nums in non-increasing order.
            For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
        Sort the values at even indices of nums in non-decreasing order.
            For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.
    Return the array formed after rearranging the values of nums. 
*/

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        // even indices
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = i + 2; j < nums.length; j += 2) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        // odd indices
        for (int i = 1; i < nums.length; i += 2) {
            for (int j = i + 2; j < nums.length; j += 2) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}