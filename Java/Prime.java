import java.util.*;
// import java.math.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        double num=n;
        sc.close();
        int k=(int) (Math.sqrt(num));
        boolean isPrime=true;
        for (int i=2;i<k;i++){
            if (n%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime==true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not A Prime Number");
        }
    }
    
}
