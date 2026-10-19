class Solution {
    public int takeCharacters(String s, int k) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a') countA++;
            else if (s.charAt(i) == 'b') countB++;
            else if(s.charAt(i) == 'c') countC++;
        }
        int atMostA = countA - k;
        int atMostB = countB- k;
        int atMostC = countC - k;

        if(atMostA < 0 || atMostB < 0 || atMostC < 0) return -1;

        int left = 0;

        int a = 0;
        int b = 0;
        int c = 0;

        int longestValid = 0;
        
        for(int right = 0; right < s.length(); right++){
            if(s.charAt(right) == 'a') a++;
            else if(s.charAt(right) == 'b') b++;
            else c++;
            while(a > atMostA || b > atMostB || c > atMostC){
                if(s.charAt(left) == 'a') a--;
                else if(s.charAt(left) == 'b') b--;
                else c--;
                left++;
            }
            longestValid = Math.max(longestValid, right-left+1);
        }
        return s.length() - longestValid;
    }
}