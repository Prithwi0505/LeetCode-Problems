class Solution {
    final static int[] x = {-1, 1, 0, 0};
    final static int[] y = {0, 0, -1, 1};

    public static boolean valid(int i, int j, int m, int n){
        if(i < 0 || j < 0 || i >= m || j >= n) return false;
        return true;
    }
    public static void dfs(int[][] image, int color, int m, int n, int i, int j, int ogColor){
        image[i][j] = color;
        for(int k = 0; k < 4; k++){
            int row = i + x[k];
            int col = j + y[k];
            if(valid(row, col, m, n) && image[row][col] == ogColor) dfs(image, color, m, n, row, col, ogColor);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int ogColor = image[sr][sc];
        if(ogColor == color) return image;
        dfs(image, color, m, n, sr, sc, image[sr][sc]);
        return image;
    }
}