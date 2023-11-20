import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rows=sc.nextInt();
        sc.close();
        for(int i=0;i<rows;i++){
            //spaces
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=0;j<i+1;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
    
    
}
