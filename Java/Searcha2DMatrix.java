/* You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity. */

import java.util.Scanner;

public class Searcha2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // printing matrix
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) { // matrix.length: calculate number of rows
            for (int j = 0; j < matrix[0].length; j++) { // matrix[0].length: calculate number
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int matrix[][] = new int[rows][columns]; // created a rows x columns matrix

        // input of elements of matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printMatrix(matrix);
        System.out.print("Enter key to be searched: ");
        int k = sc.nextInt();
        searchMatrix(matrix, k);
        sc.close();

    }

}