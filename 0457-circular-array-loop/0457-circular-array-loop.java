class Solution {
    public int nextIdx(int[] nums, int curr){
        int next = curr;
        int seq = nums[curr];
        if(seq > 0){
            next = (curr + seq) % nums.length;
        }
        else{
            int mod = seq % nums.length;
            int forward = mod + nums.length;
            next = (curr + forward) % nums.length;
        }
        return next;
    }
    public boolean circularArrayLoop(int[] nums) {
        int slow;
        int fast;
        for(int i = 0; i < nums.length; i++){
            slow = i;
            fast = i;

            boolean isPos = nums[i] > 0;

            do{
                slow = nextIdx(nums, slow);
                fast = nextIdx(nums, fast);
                if(isPos){
                    if(nums[fast] < 0) break;
                }
                else{
                    if(nums[fast] > 0) break;
                }
                fast = nextIdx(nums, fast);
                if(isPos){
                    if(nums[fast] < 0) break;
                }
                else{
                    if(nums[fast] > 0) break;
                }
                if(slow == fast){
                    if(slow != nextIdx(nums, slow)) return true;
                    break;
                }
                
            }while(slow != fast);

        }
        return false;
    }
}