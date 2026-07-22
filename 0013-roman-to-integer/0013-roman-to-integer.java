class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans = map.get(s.charAt(n-1));

        for(int i = n-2; i >= 0; i--){
            if (s.charAt(i) == 'I' && s.charAt(i+1) == 'V' || s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                ans -= map.get('I');
                continue;
            }
            if (s.charAt(i) == 'X' && s.charAt(i+1) == 'L' || s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                ans -= map.get('X');
                continue;
            }
            if (s.charAt(i) == 'C' && s.charAt(i+1) == 'D' || s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                ans -= map.get('C');
                continue;
            }
            ans += map.get(s.charAt(i));
        }
        return ans;   
    }
}