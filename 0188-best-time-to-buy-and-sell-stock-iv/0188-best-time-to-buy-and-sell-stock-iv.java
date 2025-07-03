class Solution {
    public int f(int i, int b, int k, int[] prices, int[][][] dp)
    {
        int pro = 0;
        if(i==dp.length || k==0) return 0;
      //  if(i==dp.length) return 0;
        if(dp[i][b][k]!=-1) return dp[i][b][k];
        if(b==1)
            pro = Math.max(-prices[i]+f(i+1,0,k,prices, dp), 0+f(i+1,1,k,prices,dp));
        else
            pro = Math.max(prices[i]+f(i+1,1,k-1,prices, dp), 0+f(i+1,0,k,prices,dp));
        return dp[i][b][k] = pro;   
    }
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][k+1];
        for(int [][]r: dp)
        {
            for(int[] c : r)
                Arrays.fill(c, -1);
        }
        int ans = f(0,1,k,prices,dp);
        return ans;
    }
} 