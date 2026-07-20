class Solution {
    public int countSubarrays(int[] nums) {
        int low = 0;
        int high = 2;
        int c = 0;
        while(high < nums.length){
            if((2*(nums[low] + nums[high])) == nums[low+1]) c++;
            low++;
            high++;
        }
        return c;
    }
}