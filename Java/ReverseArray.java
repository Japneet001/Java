/*Reverse Array
For example: Input is arr={1,2,3,4,5}
             Output will be {5,4,3,2,1}
*/
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.print("Reverse of the given array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+ arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th element of the array: ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        System.out.print("Given array is: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
        reverse(arr);
    }

}
