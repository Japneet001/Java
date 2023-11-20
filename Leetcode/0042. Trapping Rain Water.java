/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining. */
class Solution {
    public int trap(int[] height) {
        // Left Max Boundary
        int LeftMaxBoundary[] = new int[height.length];
        LeftMaxBoundary[0] = height[0];
        for (int i = 1; i < LeftMaxBoundary.length; i++) {
            LeftMaxBoundary[i] = Math.max(LeftMaxBoundary[i - 1], height[i]);
        }

        // Right Max Boundary
        int RightMaxBoundary[] = new int[height.length];
        RightMaxBoundary[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            RightMaxBoundary[i] = Math.max(RightMaxBoundary[i + 1], height[i]);
        }

        // Water Level
        int TrappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(LeftMaxBoundary[i], RightMaxBoundary[i]);
            TrappedWater += (waterlevel - height[i]);
        }

        return TrappedWater;

    }
}