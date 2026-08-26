class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            if(nums[low] + nums[high] == k){
                low++;
                high--;
                ans++;
            }
            else if(nums[low] + nums[high] > k) high--;
            else low++;
        }
        return ans;
    }
}