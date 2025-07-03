class Solution {
    public int f(int i, int b, int[] a, int[][][] dp, int t)
    {
        int pro = 0;
        if(t==0) return 0;
        if(i==dp.length) return 0;
        if(dp[i][b][t]!=-1) return dp[i][b][t];
        if(b==1)
            pro = Math.max(-a[i]+f(i+1,0,a,dp,t),  0+f(i+1,1,a,dp,t));
        else
            pro = Math.max(a[i]+f(i+1,1,a,dp,t-1), 0+f(i+1,0,a,dp,t));
        return dp[i][b][t] = pro;        
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][3];
        for(int[][] r: dp)
        {
            for(int[] c : r)
            Arrays.fill(c, -1);
        }
        int ma = f(0, 1, prices, dp,2);
        return ma;
    }
}