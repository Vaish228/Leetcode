class Solution {
    public int f(int i, int p, int[] nums, int[][] dp)
    {
        if(i==nums.length) return 0;
        if(dp[i][p+1]!=-1)return dp[i][p+1];
        int notpick =0+f(i+1,p, nums,dp );
        int pick =0;
        if(p==-1 || nums[p]<nums[i]){
            pick = 1+f(i+1,i,nums,dp);
        }
        return dp[i][p+1] = Math.max(pick,notpick); 

    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for(int[] r: dp)
             Arrays.fill(r,-1);
        return f(0,-1, nums, dp);
    }
}