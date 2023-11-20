/* There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.

You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product). 
*/

import java.util.Scanner;

class Sign_of_the_Product_of_an_Array {
    public static int arraySign(int[] nums) {
        int sign = 1;
        for (int n : nums) {
            if (n == 0) {
                return 0;
            }
            if (n < 0) {
                sign = -sign;
            }
        }
        return sign;
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
        int sign = arraySign(arr);
        System.out.println("Sign of the product of the array will be: " + sign);
    }
}