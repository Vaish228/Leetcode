class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<int[]> cells = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells.add(new int[]{r, c});
            }
        }
        cells.sort((a, b) -> {
            int dist1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int dist2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return Integer.compare(dist1, dist2);
        });
        int[][] result = new int[cells.size()][2];
        for (int i = 0; i < cells.size(); i++) {
            result[i] = cells.get(i);
        }

        return result;
    }
}
