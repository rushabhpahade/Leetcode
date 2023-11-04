// Best Time to Buy and Sell Stock I
// Return Maximum Profit you can make from the array. You call only buy once and sell once.
class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int cost = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
           if(cost>prices[i]){
               cost = prices[i];
           }
           else{
               profit = Math.max(profit,prices[i]-cost);
           }
        }
        return profit;
    }
}