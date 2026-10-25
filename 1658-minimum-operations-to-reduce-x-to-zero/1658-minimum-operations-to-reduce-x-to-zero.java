class Solution {
    public int minOperations(int[] nums, int x) {
        int sumNums = 0;
        for (int num : nums) {
            sumNums += num;
        }
        int target = sumNums - x;
        if (target == 0) return nums.length;
        if (target < 0) return -1;

        int left = 0;
        int windowSum = 0;
        int longest = -1;

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];

            while (windowSum > target) {
                windowSum -= nums[left];
                left++;
            }

            if (windowSum == target) {
                longest = Math.max(longest, right - left + 1);
            }
        }

        return longest == -1 ? -1 : nums.length - longest;
    }
}