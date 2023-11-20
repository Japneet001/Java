
/* Pairs in Array
For example: Input: Array is {1,2,3,4,5}
             Output: Pairs in array will be 
            (1,2) (1,3) (1,4) (1,5) 
            (2,3) (2,4) (2,5) 
            (3,4) (3,5) 
            (4,5)
*/
import java.util.*;

public class PairsInArray {
    public static void PairArray(int arr[]) {
        System.out.println("Pairs in the array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + "  ");
            }
            System.out.println();
        }
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
        System.out.print("The array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
        PairArray(arr);

    }

}
