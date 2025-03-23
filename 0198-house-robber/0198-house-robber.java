class Solution {
    // public int HR(int[] nums, int i, int[] dp) {
    //     if (i >= nums.length)
    //         return 0;
    //     if (dp[i] != -1)   
    //         return dp[i];
    //     return dp[i] = Math.max(HR(nums, i + 1, dp), HR(nums, i + 2, dp) + nums[i]);
       
    // }

    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     int[] dp = new int[n + 1];
    //     Arrays.fill(dp, -1);
    //     return HR(nums, 0, dp);
    // }

    public int rob(int[] nums)
    {
        int pr = 0;
        int m = 0;
        for(int i : nums)
        {
            int t = Math.max(m,pr+i);
            pr = m;
            m = t;
        }
        return m;
    }
}
