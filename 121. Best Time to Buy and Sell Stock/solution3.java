// Kadane's Algorithm
// the logic is to calculate the difference (maxCur += prices[i] - prices[i-1]) of the original array, and find a contiguous subarray giving maximum profit
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/39038/Kadane's-Algorithm-Since-no-one-has-mentioned-about-this-so-far-%3A)-(In-case-if-interviewer-twists-the-input)

class Solution {
    public int maxProfit(int[] prices) {
        int maxCur = 0;
        int max = 0;
        
        for(int i = 1; i < prices.length; i ++){
            maxCur = Math.max(0, maxCur + prices[i] - prices[i - 1]);
            max = Math.max(max, maxCur);
        }
        
        return max;
    }
}
