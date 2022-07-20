class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)
        {
            return 0;
        }
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] < min)
            {
                min = prices[i];
            }
            else 
            {
                profit = Math.max(profit, prices[i] - min);
            }
        }
    return profit;
        
    }
}