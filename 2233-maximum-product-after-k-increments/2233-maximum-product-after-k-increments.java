class Solution {
    public int maximumProduct(int[] nums, int k) {
        final int mod = 1000000007;
        long res = 1;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.add(num);
        }
        
        for(int i = 0; i < k; i++){
            minHeap.offer(minHeap.poll()+1);
        }
        while(!minHeap.isEmpty()){
            res = (res * minHeap.poll()) % mod;
        }
        return (int)res;
    }
}