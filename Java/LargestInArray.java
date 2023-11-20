//Largest in Array

import java.util.Scanner;

public class LargestInArray {
    public static int largestinArray(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter " + i + "th Element of array: ");
            int k = sc.nextInt();
            nums[i] = k;
        }
        sc.close();
        int largest = largestinArray(nums);
        System.out.println("Largest element in the array is " + largest);
    }

}
