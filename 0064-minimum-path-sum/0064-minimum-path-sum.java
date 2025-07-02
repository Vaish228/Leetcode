class Solution {

    int mini(int i,int j,int[][] a,int dp[][] ){
        int row=a.length;
        int col=a[0].length;

        if(i>=row || j>=col)
        return Integer.MAX_VALUE;

        if(i==row-1 && j==col-1)
        return dp[i][j]=a[i][j];

        if(dp[i][j]!=-1)
        return dp[i][j];

        int right = mini(i, j + 1, a, dp);
        int down = mini(i + 1, j, a, dp);

        return dp[i][j] = a[i][j] + Math.min(right, down);

    }
    public int minPathSum(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int dp[][]=new int[row][col];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return mini(0,0,grid,dp);


    }
}