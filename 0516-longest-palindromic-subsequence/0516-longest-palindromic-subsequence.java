class Solution {
    public int f(int i, int j, String s, String t, int[][] dp)
    {
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j))
        {
            return dp[i][j]= 1+f(i-1, j-1, s, t, dp);
        }
        return dp[i][j] = Math.max(f(i-1,j,s,t,dp), f(i, j-1, s, t,dp));


    }
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        String t = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[m][m];
        for(int[] r : dp)
        {
            Arrays.fill(r, -1);
        }
        return f(m-1, m-1, s, t, dp);
    }
}