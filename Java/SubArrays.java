
/*Print Sub Arrays:
For example: arr = {1,2,3,4,5}
Sub Arrays will be:
                (1),(1,2),(1,2,3),(1,2,3,4),(1,2,3,4,5)
                (2),(2,3),(2,3,4),(2,3,4,5)
                (3),(3,4),(3,4,5)
                (4),(4,5)
                (5)
*/

import java.util.*;

public class SubArrays {
    public static void subarray(int arr[]) {
        System.out.println("Sub Arrays of the given arrays are:");
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            System.out.println(arr[start]);
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
        subarray(arr);

    }

}
