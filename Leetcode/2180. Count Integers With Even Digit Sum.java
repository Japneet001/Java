/* Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.

The digit sum of a positive integer is the sum of all its digits. */

class Solution {
    public int countEven(int num) {
        int i = 1;
        int count = 0;
        while (i <= num) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                temp = temp / 10;
            }
            if (sum % 2 == 0) {
                count++;
            }
            i++;
        }
        return count;

    }
}