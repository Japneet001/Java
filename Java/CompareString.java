//Time Complexity: O(n)

import java.util.Scanner;

public class CompareString {
    public static boolean comparestr(String str1, String str2) {
        boolean result = true;
        if (str1.length() != str2.length()) {
            result = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }

        return result;
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
