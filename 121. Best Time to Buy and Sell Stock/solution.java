public class solution {
    // brute force: time exceeded
    /*public int maxProfit(int prices[]) {

        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for(int j = i; j < prices.length; j++){
                int sell = prices[j];
                if(sell - buy > maxprofit){
                    maxprofit = sell - buy;
                }
            }
        }
        
        return maxprofit;
    }
    
    */
    public int maxProfit(int prices[]) {
        int buy = prices[0];
        int maxprofit = 0;
        
        for(int i = 0; i < prices.length; i ++){
            if(prices[i] < buy){
                buy = prices[i];
            } else if(prices[i] - buy > maxprofit){
                maxprofit = prices[i] - buy;
            }
        }
        
        return maxprofit;
    }
    
}
