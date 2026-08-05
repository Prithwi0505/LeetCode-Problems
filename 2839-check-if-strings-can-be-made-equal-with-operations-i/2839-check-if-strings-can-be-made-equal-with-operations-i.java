class Solution {
    public void swap(StringBuilder s1, StringBuilder s2, int i, int j){
        char temp = s1.charAt(i);
        s1.setCharAt(i, s1.charAt(j));
        s1.setCharAt(j, temp);
    }
    public boolean canBeEqual(String s1, String s2) {
        StringBuilder str1 = new StringBuilder(s1);
        StringBuilder str2 = new StringBuilder(s2);
        for(int i = 0; i < 2; i++){
            if(str1.compareTo(str2) == 0) return true;
            int m = i;
            int n = i+2;
            if(str1.charAt(m) == str2.charAt(n)) swap(str1, str2, m, n);
        }
        if(str1.compareTo(str2) == 0) return true;
        return false;
    }
}