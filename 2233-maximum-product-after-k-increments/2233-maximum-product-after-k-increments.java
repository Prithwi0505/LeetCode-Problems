class Solution {
    public int maximumProduct(int[] nums, int k) {
        long res = 1;
        int mod = 1000000007;
        if(nums.length <= 0) return (int)res;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.add(num);
        }
        
        for(int i = 0; i < k; i++){
            int x = minHeap.poll();
            x++;
            minHeap.add(x);
        }
        while(!minHeap.isEmpty()){
            res = (res * minHeap.poll()) % mod;
        }
        return (int)res;
    }
}