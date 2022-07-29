class Solution {
    public int maxProfit(int[] prices) {
    int minsofar = prices[0];
      int maxprofit = 0;
      for(int i = 0; i<prices.length; i++){
        minsofar = Math.min(minsofar,prices[i]);
        int profit = prices[i] - minsofar;
        maxprofit = Math.max(maxprofit,profit);
      }
   return maxprofit;}
}