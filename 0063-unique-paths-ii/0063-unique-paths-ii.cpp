class Solution {
public:
    int solve(int i, int j, int m, int n,vector<vector<int>>& o,vector<vector<int>>&dp)
    {
        if(i>=m || j>=n)
           return 0;
        if(o[i][j]==1)
           return 0;
        if(i==m-1 && j==n-1)
           return 1;
        if(dp[i][j]!=-1)
           return dp[i][j];   
        else
           return dp[i][j]=solve(i+1,j,m,n,o,dp)+solve(i,j+1,m,n,o,dp);       
    }
    int uniquePathsWithObstacles(vector<vector<int>>& o) {
        int m = o.size();
        int n=o[0].size();
        vector<vector<int>>dp(m+1,vector<int>(n+1,-1));
        return solve(0,0,m,n,o,dp);
    }
};