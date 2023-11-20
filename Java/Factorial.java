/*
a! is factorial of a = a*(a-1)*(a-2)*.......*1
*/

import java.util.Scanner;

public class Factorial {
    public static int fact(int a){
        if (a==1){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial of " + n + " is " + fact(n));

    }

}
