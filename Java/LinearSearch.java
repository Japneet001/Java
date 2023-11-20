// Linear Search: code to find an element in a given array

import java.util.Scanner;

public class LinearSearch {
    public static int linearsearch(int arr[], int n) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return index;
            }
            index++;
        }
        return -1;
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
        System.out.print("Enter the element to be searched: ");
        int n = sc.nextInt();
        sc.close();
        int index = linearsearch(nums, n);
        if (index == -1) {
            System.out.println(n + " not found in array");
        } else {
            System.out.println("Index of " + n + " is " + index);
        }
    }

}
