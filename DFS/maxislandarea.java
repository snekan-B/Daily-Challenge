class Solution {
    int max = 0;

    public int maxAreaOfIsland(int[][] grid) {

        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && visited[i][j] == false) {
                    int c = dfs(grid, visited, i, j);
                    max = Math.max(max, c);
                }
            }
        }

        return max;
    }

    public static int dfs(int[][] grid, boolean[][] visited, int r, int c) {
        int row = grid.length;
        int col = grid[0].length;

        if (r < 0 || r >= row || c < 0 || c >= col || visited[r][c] == true || grid[r][c] == 0)
            return 0;

        visited[r][c] = true;
        int down = dfs(grid, visited, r + 1, c);
        int up = dfs(grid, visited, r - 1, c);
        int left = dfs(grid, visited, r, c - 1);
        int right = dfs(grid, visited, r, c + 1);

        int curr = 1 + (down + up + left + right);
        return curr;

    }
}