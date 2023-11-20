// Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

import java.util.Scanner;

public class Pow {
    public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        double Power = myPow(x, n);
        System.out.println(Power);
    }
}
