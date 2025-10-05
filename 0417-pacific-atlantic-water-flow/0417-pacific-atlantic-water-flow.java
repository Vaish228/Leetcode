// bfs from both sides of oceans. if we get from both traversls to a cell then it can seep into both.
// in bfs we start from the edges and we check for higher inner cells and mark them true as water can seep
// if for a cell both are marked true then they can seep into both hence we add that cell into res list.

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean[][] pacific = new boolean[m][n], atlantic = new boolean[m][n];

        Queue<int[]> q1 = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            pacific[i][0] = true;
            q1.offer(new int[] { i, 0 }); // i, j
        }
        for (int i = 0; i < n; i++) {
            pacific[0][i] = true;
            q1.offer(new int[] { 0, i }); 
        }
        bfs(heights, q1, pacific);

        Queue<int[]> q2 = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            atlantic[i][n - 1] = true;
            q2.offer(new int[] { i, n - 1 }); 
        }
        for (int i = 0; i < n; i++) {
            atlantic[m - 1][i] = true;
            q2.offer(new int[] { m - 1, i }); 
        }
        bfs(heights, q2, atlantic);

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) res.add(Arrays.asList(i, j));
            }
        }

        return res;
    }

    private void bfs(int[][] heights, Queue<int[]> q, boolean[][] vis) {
        int m = heights.length, n = heights[0].length;
        int[] rdir = new int[] { -1, 0, 1, 0 };
        int[] cdir = new int[] { 0, 1, 0, -1 };

        while (!q.isEmpty()) {
            int[] arr = q.poll();
            int r = arr[0], c = arr[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + rdir[i];
                int nc = c + cdir[i];
                
                if (nr < m && nr >= 0 && nc < n && nc >= 0 && !vis[nr][nc] && heights[r][c] <= heights[nr][nc]) {
                    vis[nr][nc] = true;
                    q.offer(new int[] { nr, nc });
                }
            }
        }
    }
}