/* Character Pattern
 Example: for n=4
            A
            BC
            DEF
            GHIJ
*/
import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        char ch='A';
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(ch);
                ch+=1;
            }
            System.out.println();
        }
    }
    
}
