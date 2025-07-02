class Solution {
    int mini(int i,int j,int dp[][],List<List<Integer>> a,int n){
 
        if(i==n-1)
        return a.get(i).get(j);

        if(dp[i][j]!=-1)
        return dp[i][j];
        
        int up=a.get(i).get(j)+mini(i+1,j,dp,a,n);
        int down=a.get(i).get(j)+mini(i+1,j+1,dp,a,n);
        return dp[i][j]=Math.min(up,down);

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        System.out.println(n);
        int dp[][]=new int[n][n];
        for(int row[]:dp)
        Arrays.fill(row,-1);

        return mini(0,0,dp,triangle,n);
        
    }
}
