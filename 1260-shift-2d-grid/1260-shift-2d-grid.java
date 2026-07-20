class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] res = new int[m][n];
        k = k % (m*n);
        for(int loop = 0; loop < k; loop++){
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if (i == 0 && j == 0) res[i][j] = grid[m-1][n-1];
                    else if(j == 0) res[i][j] = grid[i-1][n-1];
                    else{
                        res[i][j] = grid[i][j-1];
                    }
                }
            }
            grid = res;
            res = new int[m][n];
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < res.length; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < res[0].length; j++){
                row.add(grid[i][j]);
            }
            ans.add(row);
        }
        return ans;
    }
}