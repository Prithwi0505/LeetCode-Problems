class Solution {
    public int secondHighest(String s) {
        int largest = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;

        for(int i = 0; i < s.length(); i++){
            if(!Character.isLetter(s.charAt(i)) && s.charAt(i) - '0' > largest){
                largest2 = largest;
                largest = s.charAt(i) - '0';
            }
            else if(!Character.isLetter(s.charAt(i)) && s.charAt(i) - '0' > largest2 && s.charAt(i) - '0' < largest) largest2 = s.charAt(i) - '0';
        }
        if(largest2 != Integer.MIN_VALUE) return largest2;
        return -1;
    }
}