import java.util.Scanner;

public class Substring {
    // Method 1: defining own function
    public static String substr1(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method 2: in-built function
    public static String substr2(String str, int start, int end) {
        String result = str.substring(start, end);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        sc.close();
        String ans1 = substr1(str, start, end);
        String ans2 = substr1(str, start, end);

        System.out.println("By defing own function: " + ans1);
        System.out.println("By using inbuilt function: " + ans2);

    }

}
