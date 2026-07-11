class Solution {
    public int minimumSum(int n, int k) {
        HashSet<Integer> set = new HashSet<>();
        int i = 1;
        int len = 0;
        int resSum = 0;
        while(len != n){
            if(i >= k){
                resSum += i;
                set.add(i);
            }
            else{
                if(set.contains(k - i)){
                    i++;
                    continue;
                }
                else{
                    resSum += i;
                    set.add(i);
                }
            }
            i++;
            len++;
        }
        
        return resSum;
    }
}