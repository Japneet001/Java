import java.util.Scanner;

public class TrappingRainwater {
    public static void TrappedRainwater(int height[]) {
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
        System.out.println("Trapped Water is: " + TrappedWater);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of buildings: ");
        int size = sc.nextInt();
        int height[] = new int[size];
        for (int i = 0; i < height.length; i++) {
            System.out.print("Enter height of building: ");
            int element = sc.nextInt();
            height[i] = element;
        }
        sc.close();
        TrappedRainwater(height);
    }

}
