class Solution {
    public int f(int i, int j, String s, String t, int[][] dp)
    {
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j))
            return dp[i][j] = 1+f(i-1, j-1, s, t, dp);
        return dp[i][j] = Math.max(f(i-1, j, s, t, dp), f(i, j-1, s,t, dp));    
    }

    public int minInsertions(String s) {
        int n = s.length();
        String t = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[n][n];
        for(int[] r : dp)
        {
            Arrays.fill(r, -1);
        }
        int ans = f(n-1, n-1, s, t, dp);
        return n-ans;
    }
}