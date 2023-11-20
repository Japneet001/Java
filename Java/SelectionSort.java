//SELECTION SORT: Gives sorted array in decreasing order
//Time complexity: O(n^2) as two loops are running each with complexity n

import java.util.Scanner;

public class SelectionSort {
    public static void selectionsort(int arr[]) {
        for (int i = 1; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                min_index = (arr[min_index] < arr[j]) ? j : min_index;
            }
            // swap
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
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
        selectionsort(arr);
    }

}
