import java.util.Scanner;

public class Decimal_to_Binary {
    public static void DectoBin(int decNum) {
        int MyNum = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int remainder = decNum % 2;
            binNum = binNum + remainder * (int) Math.pow(10, pow);
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary form of " + MyNum + " is " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int n=sc.nextInt();
        sc.close();
        DectoBin(n);
    }

}
