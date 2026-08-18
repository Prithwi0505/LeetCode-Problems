class Solution {
    public String sortVowels(String s) {
        StringBuilder res = new StringBuilder();
        List<Character> lis = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                lis.add(ch);
            }
        }
        lis.sort(null);
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                res.append(lis.get(j++));
            }
            else{
                res.append(ch);
            }
        }
        return res.toString();
    }
}