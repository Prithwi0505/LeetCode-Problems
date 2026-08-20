class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int n = word1.length() + word2.length();
        int ptr1 = 0;
        int ptr2 = 0;
        while(ptr1 < word1.length() && ptr2 < word2.length()){
            res.append(word1.charAt(ptr1++));
            res.append(word2.charAt(ptr2++));
        }
        while(ptr1 < word1.length()){
            res.append(word1.charAt(ptr1++));
        }
        while(ptr2 < word2.length()){
            res.append(word2.charAt(ptr2++));
        }
        return res.toString();
    }
}