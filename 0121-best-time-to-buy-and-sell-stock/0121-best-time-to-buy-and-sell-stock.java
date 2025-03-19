class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mp=0;
        int min = prices[0];
        for(int i=0;i<n;i++)
        {
            if(min>prices[i])
                 min = prices[i];
            if(mp<prices[i]-min)
                 mp=prices[i]-min;     
        }
        
        return mp;
    }
}