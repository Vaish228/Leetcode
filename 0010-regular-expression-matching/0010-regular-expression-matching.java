class Solution {
    Boolean[][] dp;

    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        dp = new Boolean[m + 1][n + 1];
        return f(0, 0, s, p);
    }

    public boolean f(int i, int j, String s, String p) {
        if (dp[i][j] != null) return dp[i][j];

        // Base case: If pattern is exhausted
        if (j == p.length()) {
            return dp[i][j] = (i == s.length());
        }

        // First match check
        boolean firstMatch = (i < s.length()) &&
                             (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        // Handle '*'
        if ((j + 1 < p.length()) && (p.charAt(j + 1) == '*')) {
            // Two choices: skip `x*`, or use it if firstMatch
            boolean skip = f(i, j + 2, s, p); // zero occurrence
            boolean use = firstMatch && f(i + 1, j, s, p); // one or more
            return dp[i][j] = skip || use;
        } else {
            return dp[i][j] = firstMatch && f(i + 1, j + 1, s, p);
        }
    }
}
