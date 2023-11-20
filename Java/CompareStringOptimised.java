//Time Complexity: O(1)

import java.util.Scanner;

public class CompareStringOptimised {
    public static boolean comparestr(String str1, String str2) {

        return str1.equals(str2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter string2: ");
        String str2 = sc.nextLine();
        sc.close();
        boolean ans = comparestr(str1, str2);
        System.out.println(ans);

    }

}
