class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int minAbsDif = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            minAbsDif = Math.min(minAbsDif, Math.abs(arr[i] - arr[i+1]));
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i+1] - arr[i] == minAbsDif){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                ans.add(pair);
            }
        }
        return ans;
    }
}