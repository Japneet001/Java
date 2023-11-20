import java.util.Scanner;

public class DiagonalSum {
    public static int diagonalsuminmatrix(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j || (i + j) == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
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
        int ans = diagonalsuminmatrix(matrix);
        sc.close();
        System.out.println(ans);

    }

}
