class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        int maxLen = 0;
        while(low <= high && high < s.length()){
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);
            while(map.containsValue(2)){
                map.put(s.charAt(low), map.get(s.charAt(low)) - 1);
                if(map.get(s.charAt(low)) == 0) map.remove(s.charAt(low));
                low++;   
            }
            int len = (high - low) + 1;
            maxLen = Math.max(len, maxLen);
            high++;
        }
        return maxLen;
    }
}