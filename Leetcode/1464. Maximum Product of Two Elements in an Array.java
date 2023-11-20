// Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int prod = (nums[i] - 1) * (nums[j] - 1);
                max = Math.max(max, prod);
            }
        }
        return max;
    }
}