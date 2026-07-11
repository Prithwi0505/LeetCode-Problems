class Solution {
    public int minimumSum(int n, int k) {
        List<Integer> lis = new ArrayList<>();
        int i = 1;
        while(lis.size() != n){
            if(i >= k) lis.add(i);
            else{
                if(lis.contains(k - i)){
                    i++;
                    continue;
                }
                else lis.add(i);
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