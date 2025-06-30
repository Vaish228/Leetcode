class Solution {
    boolean isSub(int i,int t,int[] a,int dp[][]){
        if(t==0)
        return true;
        if(i==0){
            if(a[i]==t)
            return true;
            else
            return false;
        }

        if(dp[i][t]!=-1)
        return dp[i][t]==1?true:false;

        boolean notPick=isSub(i-1,t,a,dp);
        boolean pick=false;
        if(a[i]<=t)
        pick=isSub(i-1,t-a[i],a,dp);

        dp[i][t]=pick||notPick?1:0;
        return pick||notPick;
    }

    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)
        return false;

        int t=sum/2;
        int dp[][]=new int[n][t+1];

        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return isSub(n-1,t,nums,dp);
    
    }
}