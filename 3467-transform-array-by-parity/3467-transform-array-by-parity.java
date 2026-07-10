class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        for(int num : nums){
            if(num % 2 == 0) ans[i++] = 0;
        }    
        while(i < ans.length){
            ans[i++] = 1;
        }
        return ans;
    }
}