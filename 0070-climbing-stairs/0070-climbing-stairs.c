int solve(int n, int *dp)
{
    if(n==1 || n==2)
       return n;
    if(dp[n]!=-1)
       return dp[n];
    else   
    return dp[n]=solve(n-1,dp)+solve(n-2,dp);   

}

int climbStairs(int n) {
    // if(n==1 || n==2)
    //    return n;
    // return climbStairs(n-1)+climbStairs(n-2);   
    int dp[n+1];
    memset(dp,-1,sizeof(dp));
    return solve(n,dp);
}