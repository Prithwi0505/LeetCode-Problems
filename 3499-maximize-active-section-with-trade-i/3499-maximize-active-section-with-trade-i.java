class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        int prevZero = -1;
        int maxGain = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') ones++;
        }
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            int len = j - i;
            if (s.charAt(i) == '0') {
                if (prevZero != -1) {
                    maxGain = Math.max(maxGain, prevZero + len);
                }
                prevZero = len;
            }
            i = j;
        }
        return ones + maxGain;
    }
}