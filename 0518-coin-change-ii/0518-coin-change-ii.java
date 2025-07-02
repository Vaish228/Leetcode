class Solution { // like the same as perfect sum in gfg but value can be repeated


    int sub(int i,int t,int a[],int dp[][]){
        if(t==0)
        return 1;

        if(i==0){
        if(t%a[i]==0) //value at i=0 can repeated if it multiplies of t or else not
        return 1;
        else
        return 0;
        }
        
        if(dp[i][t]!=-1)
        return dp[i][t];

        int notPick=sub(i-1,t,a,dp);
        int pick=0;
        if(a[i]<=t){
            pick=sub(i,t-a[i],a,dp); // same value can be repeated keeping same i position
        }
        return dp[i][t]=pick+notPick;
        
    }

    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int[]row:dp)
        Arrays.fill(row,-1);

        return sub(n-1,amount,coins,dp);
    }
}
