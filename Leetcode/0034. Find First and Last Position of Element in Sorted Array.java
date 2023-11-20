/*  Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
    If target is not found in the array, return [-1, -1].
    You must write an algorithm with O(log n) runtime complexity.
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int count = 0;
        int position = 0;
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                position = i;
                count++;
            }
        }
        if (count == 0) {
            result[0] = -1;
            result[1] = -1;
        } else {
            result[0] = position - count + 1;
            result[1] = position;
        }
        return result;

    }
}