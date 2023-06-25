
/*Search an element in 2D Array */

import java.util.Scanner;

public class Search2DArray {
    // search in matrix
    public static void searchMatrix(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) { // matrix.length: calculate number of rows
            for (int j = 0; j < matrix[0].length; j++) { // matrix[0].length: calculate number
                if (key == matrix[i][j]) {
                    System.out.print("element is at postion: " + i + " " + j);
                }
            }
        }
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
