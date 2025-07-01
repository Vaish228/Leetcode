// class Solution {
//     public boolean f(int i, int target, int[] nums, int[][] dp)
//     {
//         if(target==0) return true;
//         if(i==0) 
//         //return target == nums[0];
//         {
//             if(nums[i]==target) return true;
//             else return false;
//         }
//         if(dp[i][target]!=-1) return dp[i][target]==1 ? true : false;
//         Boolean notpick = f(i-1, target, nums, dp);
//         Boolean pick = false;
//         if(nums[i]<=target)
//         {
//             pick = f(i-1, target-nums[i], nums, dp);
//         }
//         dp[i][target] = pick || notpick ? 1 : 0;
//         return pick || notpick;

//     }
//     public boolean canPartition(int[] nums) {
//        int sum =0;
//        for(int a: nums){
//         sum+=a;
//        }
//        if(sum%2==1) return false;
//        int n = nums.length;
//        int target = sum/2;
//        int[][] dp = new int[n][target+1];
//        Boolean ans = f(n-1, target, nums, dp);
//        return ans;
//     }
// }
class Solution {
    public boolean f(int[] a, int i, int t, int[][] dp)
    {
        if(t==0) return true;
        if(i==0)
        {
            if(a[i]==t) return true;
            else return false;
        }
        if(dp[i][t]!=-1) return dp[i][t]==1? true: false;

        Boolean notpick = f(a, i-1, t, dp);
        Boolean pick = false;
        if(t>=a[i])
            pick = f(a, i-1, t-a[i], dp);

        dp[i][t] = pick||notpick ? 1:0;    
        return pick||notpick;
    }

    public boolean canPartition(int[] nums) {
        int s = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            s+=nums[i];
        }
        if(s%2!=0) return false;
        int t = s/2;
        int[][] dp = new int[n][t+1];
        for(int[] r : dp)
        {
            Arrays.fill(r, -1);
        }
        return f(nums, n-1, t, dp);
    
    }
}