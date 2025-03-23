class Solution {
    public static int LCS(int i, int j, int n1, int n2, String s1, String s2, int[][] dp) {
        if (i >= n1 || j >= n2)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        
        if (s1.charAt(i) == s2.charAt(j))
            dp[i][j] = 1 + LCS(i + 1, j + 1, n1, n2, s1, s2, dp);
        else
            dp[i][j] = Math.max(LCS(i + 1, j, n1, n2, s1, s2, dp), LCS(i, j + 1, n1, n2, s1, s2, dp));
        
        return dp[i][j];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int[][] dp = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                dp[i][j] = -1;
            }
        }
        return LCS(0, 0, n1, n2, text1, text2, dp);
    }
}
