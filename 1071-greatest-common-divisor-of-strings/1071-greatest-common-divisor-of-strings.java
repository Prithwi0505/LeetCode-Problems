class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        int len1 = str1.length();
        int len2 = str2.length();

        int gcd = 0;
        for(int i = Math.max(len1, len2); i >= 1; i--){
            if(len1 % i == 0 && len2 % i == 0){
                gcd = i;
                break;
            }
        }
        return str1.substring(0,gcd);
    }
}