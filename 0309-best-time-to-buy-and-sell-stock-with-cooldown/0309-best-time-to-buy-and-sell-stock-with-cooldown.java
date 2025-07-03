class Solution {
    public int f(int i, int b,int[] prices, int[][] dp)
    {
        int pro = 0;
        if(i>=dp.length) return 0;
        if(dp[i][b]!=-1) return dp[i][b];
        if(b==1)
            pro = Math.max(-prices[i]+f(i+1,0,prices, dp), 0+f(i+1,1,prices,dp));
        else
            pro = Math.max(prices[i]+f(i+2,1,prices, dp), 0+f(i+1,0,prices,dp));
        return dp[i][b] = pro;   
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int []r: dp)
        {
                Arrays.fill(r, -1);
        }
        int ans = f(0,1,prices,dp);
        return ans;
    }
} 