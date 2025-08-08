class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int r = grid.length, c = grid[0].length, count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    changeOnes(grid, i, j, r, c);
                }
            }
        }
        return count;
    }

    public void changeOnes(char[][] grid, int row, int col, int r, int c){
        if(row<0 || row>=r || col<0 || col>=c || grid[row][col]!='1') return;
        grid[row][col] = 0;

        changeOnes(grid, row+1, col, r, c);
        changeOnes(grid, row-1, col, r, c);
        changeOnes(grid, row, col+1, r, c);
        changeOnes(grid, row, col-1, r, c);
    }
}