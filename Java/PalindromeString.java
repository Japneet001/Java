//Time Complexity: O(n)

import java.util.Scanner;

public class PalindromeString {
    public static boolean ispalindromestr(String str) {
        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        sc.close();
        boolean ans = ispalindromestr(str);
        System.out.println(ans);

    }

}
