class Solution {
    public int hcf(int n1, int n2){
        int i;
        if(n1 >= n2) i = n2;
        else i = n1;
        for(int j = i; j >= 1; j--){
            if(n1 % j == 0 && n2 % j == 0) return j;
        }
        return 1;
    }
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            small = Math.min(small, nums[i]);
            large = Math.max(large, nums[i]);
        }
        return hcf(small, large);
    }
}