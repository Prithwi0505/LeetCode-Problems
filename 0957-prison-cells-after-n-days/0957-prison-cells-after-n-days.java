class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        //HashMap<Integer, Integer> map = new HashMap<>();
        //HashMap<index, value>

        int[] res = new int[cells.length];
        res[0] = 0;
        res[cells.length-1] = 0;
        if(n > 14){
            n = (n - 1) % 14 + 1;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < cells.length-1; j++){
                if(cells[j-1] == 0 && cells[j+1] == 0) res[j] = 1;
                else if(cells[j-1] == 1 && cells[j+1] == 1) res[j] = 1;
                else res[j] = 0;
            }
            System.arraycopy(res, 0, cells, 0, res.length);
        }
        return res;
    }
}