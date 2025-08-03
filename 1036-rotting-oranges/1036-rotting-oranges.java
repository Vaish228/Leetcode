class Pair{
    int row;
    int col;
    int min;
    Pair(int row,int col,int min)
    {
        this.col=col;
        this.row=row;
        this.min=min;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fruit=0,max=0;
        int vis[][] = new int[m][n];
        Queue<Pair> q1 = new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q1.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
                if(grid[i][j]==1)
                {
                    fruit++;
                }
            }
        }
        int drow[]={-1,1,0,0};
        int dcol[]={0,0,1,-1};
        while(!q1.isEmpty())
        {
            int col=q1.peek().col;
            int row=q1.peek().row;
            int min=q1.peek().min;
            max=min;
            q1.poll();
            for(int i=0;i<4;i++)
            {
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]!=1 && grid[nrow][ncol]==1)
                {
                    q1.add(new Pair(nrow,ncol,min+1));
                    fruit--;
                    vis[nrow][ncol]=1;
                }
            }
        }
        if(fruit==0)
          return max;
        return -1; 
        
    }
}