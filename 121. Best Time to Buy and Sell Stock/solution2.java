class solution2 {
    // 122. Best Time to Buy and Sell Stock II

    public int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int profit = 0;
        
        for(int i = 1; i < prices.length; i ++){
            
            if(prices[i] < prices[i - 1] && prices[i - 1] >= buyprice ){
                profit += prices[i - 1] - buyprice;
                buyprice = prices[i];
                
            } else if(i == prices.length - 1 && prices[i] >= prices[i - 1]){
                profit += prices[i] - buyprice;
            }
            
        }
                
        return profit;
    }
}
