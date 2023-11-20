/*Convert Binary to Decimal 
For Example: Binary Number is 101

Output: Decimal form will be 5

Explanation: 
101= (1*2^2)+(0*2^1)+(1*2^0)
*/
import java.util.Scanner;

public class Binary_to_Decimal{
    public static void BintoDec(int binNum){
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit = binNum%10;
            decNum+=lastDigit*(int)Math.pow(2,pow);
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of " +binNum+" is "+decNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int n=sc.nextInt();
        sc.close();
        BintoDec(n);
        
    }
}
