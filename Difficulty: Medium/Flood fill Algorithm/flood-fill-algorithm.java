class Solution {
    private static void dfs(int[][] image, int x, int y, int m, int n, 
    int oldColor, int newColor) {
        if (x < 0 || y < 0 ||
            x >= m || y >= n ||
            image[x][y] != oldColor) 
            return;
        
        image[x][y] = newColor;
        dfs(image, x - 1, y, m, n, oldColor, newColor);
        dfs(image, x, y + 1, m, n, oldColor, newColor);
        dfs(image, x + 1, y, m, n, oldColor, newColor);
        dfs(image, x, y - 1, m, n, oldColor, newColor);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // code here
        if (image[sr][sc] == newColor) return image;

        int m = image.length;
        int n = image[0].length;
        int oldColor = image[sr][sc];

        dfs(image, sr, sc, m, n, oldColor, newColor);

        return image;
    }
}