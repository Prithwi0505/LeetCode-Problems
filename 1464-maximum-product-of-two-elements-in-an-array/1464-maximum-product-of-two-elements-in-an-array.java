class Solution {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= largest){
                largest2 = largest;
                largest = nums[i];
            }
            else if(nums[i] > largest2 && nums[i] < largest){
                largest2 = nums[i];
            }
        }
        return (largest-1) * (largest2-1);
    }
}