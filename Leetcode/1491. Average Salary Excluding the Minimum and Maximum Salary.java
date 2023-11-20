/*You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted. */

class Solution {
    public double average(int[] salary) {
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
}