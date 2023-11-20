/*  There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
    You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
*/

import java.util.Scanner;

class Find_the_Highest_Altitude {
    public static int largestAltitude(int[] gain) {
        int size = gain.length + 1;
        int altitudes[] = new int[size];
        altitudes[0] = 0;
        for (int i = 1; i < altitudes.length; i++) {
            altitudes[i] = altitudes[i - 1] + gain[i - 1];
        }
        int highest_altitude = Integer.MIN_VALUE;
        for (int i = 0; i < altitudes.length; i++) {
            System.out.print(altitudes[i] + " ");
            if (altitudes[i] > highest_altitude) {
                highest_altitude = altitudes[i];
            }
        }
        System.out.println();
        return highest_altitude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of gain array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th element of gain array: ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        System.out.print("Gain array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
        int highest_alt = largestAltitude(arr);
        System.out.println("Highest Altitude is: " + highest_alt);

    }
}