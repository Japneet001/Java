/*You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted. */

import java.util.Scanner;

class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static double average(int[] salary) {
        double sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < salary.length; i++) {
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
            sum += salary[i];
        }
        double total = sum - max - min;
        double average = total / (salary.length - 2);
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            int element = sc.nextInt();
            arr[i] = element;
        }
        sc.close();
        double avg = average(arr);
        System.out.println("Average of salaries excluding minimum and maximum Salary is: " + avg);
    }
}