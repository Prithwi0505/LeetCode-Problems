class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        int maxLen = 0;
        while(low <= high && high < s.length()){
            if(map.containsKey(s.charAt(high))){
                if(map.get(s.charAt(high)) >= low) low = map.get(s.charAt(high)) + 1;
            }
            int len = (high - low) + 1;
            maxLen = Math.max(len, maxLen);
            map.put(s.charAt(high), high);
            high++;
        }
        return maxLen;
    }
}