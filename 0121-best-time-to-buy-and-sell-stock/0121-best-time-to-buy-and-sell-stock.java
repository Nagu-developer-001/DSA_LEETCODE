class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0,BuyingStock = prices[0];
        for(int i = 0;i<prices.length;i++){
            if(BuyingStock>prices[i]){
                BuyingStock = prices[i];
            }else{
                int CurrProfit = prices[i] - BuyingStock;
                profit = Math.max(CurrProfit,profit);
            }
        }
        return profit;
    }
}