// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


class Solution {
    public int maxProfit(int[] prices) {

        int low = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
           int curprofit=prices[i]-low;
            profit=Math.max(curprofit,profit);
            low=Math.min(prices[i],low);
            


        }

        return profit;
    }
}
