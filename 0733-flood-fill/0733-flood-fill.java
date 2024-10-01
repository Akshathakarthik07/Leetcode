class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor = image[sr][sc];
        if (initialColor != color) {
            dfs(image, sr, sc, initialColor, color);
        }
        return image;
    }

    private void dfs(int[][] image, int row, int col, int initialColor, int newColor) {
        int n = image.length;
        int m = image[0].length;

        if (row < 0 || row >= n || col < 0 || col >= m || image[row][col] != initialColor) {
            return;
        }

        image[row][col] = newColor;
        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, +1, 0, -1};

        
        for (int i = 0; i < 4; i++) {
            dfs(image, row + drow[i], col + dcol[i], initialColor, newColor);
        }
    }
}