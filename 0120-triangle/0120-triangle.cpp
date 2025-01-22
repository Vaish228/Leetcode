class Solution {
public:
    int solve(int i, int j, int m, vector<vector<int>>& dp, vector<vector<int>>& t)
    {
        
        if(i==m-1)
           return t[i][j];
        if(dp[i][j]!=-1)
           return dp[i][j];
        return dp[i][j]=t[i][j]+ min(solve(i+1,j,m,dp,t), solve(i+1,j+1,m,dp,t));


    }
    int minimumTotal(vector<vector<int>>& t) {
        int m = t.size();
        vector<vector<int>>dp(m+1,vector<int>(m+1,-1));
        return solve(0,0,m,dp,t);
    }
};