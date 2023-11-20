import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int ReverseNumber=0;
        while (n>0){
            int rem=n%10;
            ReverseNumber=ReverseNumber*10+rem;
            n/=10;
        }
        System.out.println(ReverseNumber);
    }
    
}
