class Solution {
    public boolean f(int i, int j, String s, String p, Boolean[][] dp)
    {
         if(dp[i][j]!=null) return dp[i][j];
         if(j==p.length())
            return dp[i][j] = (i==s.length());
         Boolean frst = (i<s.length()) && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.');
         if(j+1 < p.length() && p.charAt(j+1)=='*')
         {
            Boolean skip = f(i, j+2, s, p, dp);
            Boolean use = frst && f(i+1, j, s, p, dp);
            return dp[i][j] = skip || use;
         } 
         else{
            return dp[i][j] = frst && f(i+1, j+1, s, p, dp);
         }
    }
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        Boolean[][] dp = new Boolean[n+1][m+1];
        for(Boolean[] r: dp)
        {
            Arrays.fill(r,null);
        }
        return f(0,0,s,p,dp);
    }

}