class Solution {
    public int lcs(String w1, String w2, int i, int j, int[][] dp)
    {
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(w1.charAt(i)==w2.charAt(j)){
            return dp[i][j] = 1+lcs(w1, w2, i-1, j-1, dp);
        }
        
        return dp[i][j] = Math.max(lcs(w1, w2, i-1, j, dp), lcs(w1, w2, i, j-1, dp));
    }
    public int minDistance(String word1, String word2) {
        int m1 = word1.length();
        int m2 = word2.length();
        int[][] dp = new int[m1][m2];
        for(int[] r: dp)
        {
            Arrays.fill(r, -1);
        }
        int ans = lcs(word1, word2, m1-1, m2-1, dp);
        return m1+m2-2*(ans);
    }
}