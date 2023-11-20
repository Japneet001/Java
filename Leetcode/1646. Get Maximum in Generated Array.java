/*  You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:
        nums[0] = 0
        nums[1] = 1
        nums[2 * i] = nums[i] when 2 <= 2 * i <= n
        nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
    Return the maximum integer in the array nums​​​. 
*/

class Solution {
    public int getMaximumGenerated(int n) {
        int nums[] = new int[n + 1];
        nums[0] = 0;
        if (n > 0) {
            nums[1] = 1;
        }

        for (int i = 0; i < n + 1; i++) {
            if (i % 2 == 0) {
                int j = i / 2;
                nums[i] = nums[j];
            } else {
                int j = (i - 1) / 2;
                nums[i] = nums[j] + nums[j + 1];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n + 1; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }
}