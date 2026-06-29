class Solution {
    private static void dfs(int i, int j, int m, int n, char[][] grid) {
        if (i < 0 || i >= m || j < 0 || j >= n) return;
        
        if (grid[i][j] != 'L') 
            return;
            
        grid[i][j] = '#';
        
        for (int di = -1; di <= 1; ++di) {
            for (int dj = -1; dj <= 1; ++dj) {
                if (di == 0 && dj == 0) continue;
                dfs(i + di, j + dj, m, n, grid);
            }
        }
    }
    
    public int countIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int countOfIslands = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'L') {
                    dfs(i, j, m, n, grid);
                    countOfIslands++;
                }
            }
        }

        return countOfIslands;
    }
}