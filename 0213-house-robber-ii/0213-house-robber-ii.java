class Solution {
    public int f(int i, int[] nums, int[] dp)
    {
        if(i<0) return 0;
        if(i==0) return nums[0];
        if(dp[i]!=-1) return dp[i];
        int pick = nums[i]+f(i-2, nums, dp);
        int notpick = 0+f(i-1, nums, dp);
        return dp[i] = Math.max(pick, notpick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] dp1 = new int[n-1];
        int[] dp2 = new int[n-1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        int[] nums1 = new int[n-1];
        int j=0;
        for(int i=1;i<n;i++)
        {
            nums1[j++] = nums[i]; 
        }
        int ans1= f(n-2, nums, dp1);
        int ans2= f(n-2, nums1, dp2);
        return Math.max(ans1, ans2);
    }
}