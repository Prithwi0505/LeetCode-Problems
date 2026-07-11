class Solution {
    public int minimumSum(int n, int k) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> lis = new ArrayList<>();
        int i = 1;
        while(lis.size() != n){
            if(i >= k){
                lis.add(i);
                set.add(i);
            }
            else{
                if(set.contains(k - i)){
                    i++;
                    continue;
                }
                else{
                    lis.add(i);
                    set.add(i);
                }
            }
            i++;
        }
        int resSum = 0;
        for(int num : lis){
            resSum += num;
        }
        return resSum;
    }
}