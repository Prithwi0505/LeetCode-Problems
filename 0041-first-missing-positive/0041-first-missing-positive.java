class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(num > 0) set.add(num);
        }
        int ans = 1;
        int i = 1;
        while(i <= nums.length+1){
            if(!set.contains(i)){
                ans = i;
                return ans;
            }
            i++;
        }
        return ans;
    }
}