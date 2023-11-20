import java.util.Scanner;

public class SprilMatrix {
    public static void sprilmatrix(int arr[][]) {
        int StartRow = 0;
        int EndRow = arr.length - 1;
        int StartCol = 0;
        int EndCol = arr[0].length - 1;
        while (StartRow <= EndRow && StartCol <= EndCol) {
            // top
            for (int j = StartCol; j < EndCol; j++) {
                System.out.print(arr[StartRow][j] + " ");
            }
            // right
            for (int i = StartRow; i < EndRow; i++) {
                System.out.print(arr[i][EndCol] + " ");
            }
            // bottom
            for (int j = EndCol; j > StartCol; j--) {
                if (StartRow == EndRow) {
                    break;
                }
                System.out.print(arr[EndRow][j] + " ");

            }
            // left
            for (int i = EndRow; i > StartRow; i--) {
                if (StartCol == EndCol) {
                    break;
                }
                System.out.print(arr[i][StartCol] + " ");
            }
            StartRow++;
            EndRow--;
            StartCol++;
            EndCol--;
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
        System.out.println();
        sprilmatrix(matrix);
        sc.close();

    }
}
