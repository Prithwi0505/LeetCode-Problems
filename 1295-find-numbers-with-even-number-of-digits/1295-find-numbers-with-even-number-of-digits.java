class Solution {
    public int digitCount(int n){
        int dc = 0;
        while(n != 0){
            dc++;
            n = n/10;
        }
        return dc;
    }
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(digitCount(nums[i]) % 2 == 0) res++;
        }
        return res;
    }
}