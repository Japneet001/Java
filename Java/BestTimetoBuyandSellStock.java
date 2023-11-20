/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */

import java.util.Scanner;

public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            int sellprice = prices[i];
            if (buyprice < sellprice) {
                int profit = sellprice - buyprice;
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            } else {
                buyprice = sellprice;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter price: ");
            int price = sc.nextInt();
            arr[i] = price;
        }
        sc.close();
        int maxprofit = maxProfit(arr);
        System.out.println("Maximum Profit: " + maxprofit);
    }
}