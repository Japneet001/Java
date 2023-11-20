/*  Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
    Return any array that satisfies this condition.
*/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] % 2 != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}