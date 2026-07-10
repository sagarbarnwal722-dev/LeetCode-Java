class Solution {
    public int maxProfit(int[] prices) {
      int lowprice=prices[0];
      int profit=0;
      for(int i=0;i<prices.length;i++)
      {
        if(lowprice<prices[i])
        {
        profit=Math.max(prices[i]-lowprice,profit);
        }
        else
        {
            lowprice=prices[i];

        }
      }
      return profit;
    }
}
