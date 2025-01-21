class Solution {
public:
    int solve(int i,vector<int>& cost,vector<int>&dp)
    {
        // int n=cost.size();
        // if(idx>=n)
        //    return 0;
        // else
        //    return cost[idx]+min(solve(idx+1,cost),solve(idx+2,cost));   

        int n=cost.size();
        if(i>=n)
           return 0;
        if(dp[i]!=-1)
           return dp[i];
        else
           return dp[i]=cost[i]+min(solve(i+1,cost,dp),solve(i+2,cost,dp));      



    }
    int minCostClimbingStairs(vector<int>& cost) {
        int n=cost.size();
        vector<int>dp(n+1,-1);
        return min(solve(0,cost,dp), solve(1,cost,dp));
    }
};