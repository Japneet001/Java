/* Half Pyramid using Numbers
Example: for n=4
            1
            12
            123
            1234
*/
import java.util.Scanner;

public class HalfPyramidusingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
