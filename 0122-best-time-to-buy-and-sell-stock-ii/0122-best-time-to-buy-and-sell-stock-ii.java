class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mp=0;
        for(int i=1;i<n;i++)
        {
            if(prices[i]>prices[i-1])
                 mp+=(prices[i]-prices[i-1]);
        }
        return mp;
    }
}