class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length < 1){
            return 0;
        }
        Arrays.sort(tokens);
        int score = 0;
        int low = 0;
        int high = tokens.length-1;
        while(low < high){
            if(power < tokens[low] && ((power + tokens[high]) < tokens[low])){
                return 0;
            }
            else if(power < tokens[low] && score >= 1 && (power + tokens[high] >= tokens[low])){
                power += tokens[high];
                high--;
                score--;
                power -= tokens[low];
                low++;
                score++;
            }
            else if(power >= tokens[low]){
                power -= tokens[low];
                low++;
                score++;
            }
            else return score;
        }
        if(power >= tokens[low]){
            score++;
        }
        return score;
    }
}