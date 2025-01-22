class Solution {
public:
    int lcs(int i, int j, int n1, int n2, string &t1, string &t2,vector<vector<int>>&dp)
    {
        if (i>=n1 || j>=n2)
           return 0;
        if(dp[i][j]!=-1)
           return dp[i][j];
        if(t1[i]==t2[j])
           return dp[i][j]=1+lcs(i+1,j+1,n1,n2,t1,t2,dp);
        else   
           return dp[i][j] = max(lcs(i+1,j,n1,n2,t1,t2,dp),lcs(i,j+1,n1,n2,t1,t2,dp));         
    }
    int longestCommonSubsequence(string t1, string t2) {
        int n1=t1.size();
        int n2=t2.size();
        vector<vector<int>>dp(n1,vector<int>(n2,-1));
        return lcs(0,0,n1,n2,t1,t2,dp);
    }
};