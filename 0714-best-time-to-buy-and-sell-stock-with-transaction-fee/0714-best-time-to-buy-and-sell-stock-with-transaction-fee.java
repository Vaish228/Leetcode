class Solution {
    public int f(int i, int b, int[] a, int[][]dp, int f)
    {
        int pro =0;
        if(i==dp.length) return 0;
        if(dp[i][b]!=-1) return dp[i][b];
        if(b==1)
            pro = Math.max(-a[i]+f(i+1,0,a,dp,f), 0+f(i+1,1,a,dp,f));
        else
            pro = Math.max(a[i]+f(i+1,1,a,dp,f) -f, 0+f(i+1,0,a,dp,f));
        return dp[i][b] = pro;        
    }
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][]dp = new int[n][2];
        for(int []r : dp)
        {
                Arrays.fill(r,-1);
        }
        int ans = f(0,1,prices, dp, fee);
        return ans;
    }
}