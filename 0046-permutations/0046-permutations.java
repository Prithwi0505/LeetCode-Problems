class Solution {
    public void backtrack(List<List<Integer>> res, int[] nums, List<Integer> temp){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int num : nums){
            if(temp.contains(num)) continue;
            temp.add(num);
            backtrack(res, nums, temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(res, nums, temp);
        return res;
    }
}