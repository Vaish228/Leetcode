class Solution {
    public int f(int i, int[] a, int[] dp)
    {
        if(i<0) return 0;
        if(i==0) return a[i];
        if(dp[i]!=-1) return dp[i];
        int notpick = 0 + f(i-1, a, dp);
        int pick = a[i] + f(i-2, a, dp);
        return dp[i]= Math.max(pick, notpick);

    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[]dp = new int[n+1];
        Arrays.fill(dp, -1);
        return f(n-1,nums,dp);
    }
}