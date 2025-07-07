class Solution {
    public int solve(int i, int j, int m, int n, int[][] o, int[][] dp) {
        // Out of bounds
        if (i >= m || j >= n)
            return 0;

        // Obstacle
        if (o[i][j] == 1)
            return 0;

        // Reached destination
        if (i == m - 1 && j == n - 1)
            return 1;

        // Already computed
        if (dp[i][j] != -1)
            return dp[i][j];

        // Move down and right
        return dp[i][j] = solve(i + 1, j, m, n, o, dp) + solve(i, j + 1, m, n, o, dp);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // Create DP table filled with -1
        int[][] dp = new int[m + 1][n + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(0, 0, m, n, obstacleGrid, dp);
    }
}
