class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandies = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++){
            greatestCandies = Math.max(greatestCandies, candies[i]);
        }
        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= greatestCandies) res.add(true);
            else res.add(false);
        }
        return res;
    }
}