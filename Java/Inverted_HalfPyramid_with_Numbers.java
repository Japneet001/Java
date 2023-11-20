/* Inverted Half Pyramid with Numbers Pattern
For example: for rows=5
                12345
                1234
                123
                12
                1
*/

import java.util.Scanner;

public class Inverted_HalfPyramid_with_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();
        sc.close();
        for (int i = rows; i > 0; i--) {
            int num = 1;
            for (int j = i; j > 0; j--) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

}
