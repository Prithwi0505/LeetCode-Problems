class Solution {
    public boolean fun(int i, int j, String s){
        int ptr1 = i;
        int ptr2 = j;
        while (ptr1 < ptr2){
            if(s.charAt(ptr1) == s.charAt(ptr2)){
                ptr1++;
                ptr2--;
            }
            else
                return false;
        }
        return true;
    }
    public String longestPalindrome(String s){
        int n = s.length();
        int maxLen = 1;
        int start = 0;
        for (int  i =0; i < n; i ++){
            for (int j = i; j < n ; j++){
                if (fun(i, j, s) == true){
                    int currLen = j-i+1;
                    if (currLen > maxLen){
                        start = i;
                        maxLen = currLen;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}