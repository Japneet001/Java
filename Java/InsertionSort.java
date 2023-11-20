//INSERTION SORT
//Time complexity: O(n^2) as two loops are running each with complexity n

import java.util.Scanner;

public class InsertionSort {
    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;

        }
        printArray(arr);

    }

    public static void printArray(int arr[]) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            int element = sc.nextInt();
            arr[i] = element;
        }
        sc.close();
        insertionsort(arr);
    }

}
