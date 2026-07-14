class Solution {
    public int longestWPI(int[] hours) {
        if(hours.length <= 0) return 0;
        int[] arr = new int[hours.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxInterval = 0;
        for(int i = 0; i < hours.length; i++){
            if(hours[i] > 8) arr[i] = 1;
            else arr[i] = -1;
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum > 0) maxInterval = Math.max(maxInterval, i+1);
            else if(map.containsKey(sum - 1)){
                maxInterval = Math.max(maxInterval, i - map.get(sum -1));
            }
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        return maxInterval;
    }
}