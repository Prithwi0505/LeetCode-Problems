class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            int c = 1;
            while(i+1 < chars.length && chars[i] == chars[i+1]){
                c++;
                i++;
            }
            s.append(chars[i]);
            if(c > 1) s.append(c); 
        }
        for(int i = 0; i < s.length(); i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}