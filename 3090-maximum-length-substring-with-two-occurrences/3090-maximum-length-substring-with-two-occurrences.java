class Solution {
    public int maximumLengthSubstring(String s) {
        int ans = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        while(high < s.length()){
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);
            while(map.get(s.charAt(high)) > 2){
                map.put(s.charAt(low), map.get(s.charAt(low)) - 1);
                //if(map.get(s.charAt(low)) == 0) map.remove(s.charAt(low));
                low++;
            }
            ans = Math.max(ans, high - low + 1);
            high++;
        }
        return ans;
    }
}