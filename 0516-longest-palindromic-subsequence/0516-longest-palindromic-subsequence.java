class Solution {
    public int LPS(int i, int j, int n, int[][] dp, String s)
    {
        if(i>j)
            return 0;
        if(i==j)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        else
            if(s.charAt(i)==s.charAt(j))
                return dp[i][j] = 2+LPS(i+1,j-1,n,dp,s);
            else
                return dp[i][j] = Math.max(LPS(i,j-1,n,dp,s), LPS(i+1,j,n,dp,s));                
    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return LPS(0,n-1,n,dp,s);
    }
}