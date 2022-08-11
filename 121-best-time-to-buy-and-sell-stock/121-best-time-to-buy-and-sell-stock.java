class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)
        {
            return 0;
        }
        int maxprofit = 0;
        int minprofit = prices[0];
        for (int i = 1; i < prices.length; i++)
        {
           
            minprofit = Math.min(minprofit, prices[i]);
         
            maxprofit = Math.max(maxprofit, prices[i] - minprofit);
        }
    
    return maxprofit;
        
    }
}