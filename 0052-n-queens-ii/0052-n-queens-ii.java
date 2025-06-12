class Solution {
     List<List<String>> res;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        res = new ArrayList<>();
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
           // System.out.println();
        } 
        List<int[]> queen = new ArrayList<>();
        dfs(board, 0 , queen);
        return res.size();
    }
    public void dfs(char[][] board, int r, List<int[]> queen)
    {
        if(queen.size()==board.length)
        {
            List<String> rows = new ArrayList<>();
            for(char[] row : board){
                rows.add(new String(row));
            }
            res.add(rows);
        }
        for(int c =0 ;c<board.length;c++)
        {
            if(canAddQueen(r,c,board))
            {
                board[r][c]='Q';
                queen.add(new int[]{r,c});
                dfs(board, r+1, queen);
                board[r][c]='.';
                queen.remove(queen.size()-1);
            }
        }
    }

    public boolean canAddQueen(int r, int c, char board[][])
    {
         for (int i = 0; i < r; i++) {
        if (board[i][c] == 'Q') return false;
    }

    // Check upper-left diagonal (↖)
    for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 'Q') return false;
    }

    // Check upper-right diagonal (↗)
    for (int i = r - 1, j = c + 1; i >= 0 && j < board.length; i--, j++) {
        if (board[i][j] == 'Q') return false;
    }

    return true;
    }
    
   
}