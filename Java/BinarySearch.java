// Binary Search

import java.util.Scanner;

public class BinarySearch {
    public static int binarysearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + "th element of array: ");
            int element = sc.nextInt();
            arr[i] = element;
        }
        System.out.print("Enter key to be searched: ");
        int key = sc.nextInt();
        sc.close();
        int index = binarysearch(arr, key);
        if (index == -1) {
            System.out.println(key + " not found in the array.");
        } else {
            System.out.println(key + " found at index " + index);
        }
    }

}
