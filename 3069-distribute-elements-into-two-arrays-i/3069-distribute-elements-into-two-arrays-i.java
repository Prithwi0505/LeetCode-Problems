class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> lis1 = new ArrayList<>();
        List<Integer> lis2 = new ArrayList<>();

        lis1.add(nums[0]);
        lis2.add(nums[1]);

        for(int i = 2; i < nums.length; i++){
            if(lis1.get(lis1.size()-1) > lis2.get(lis2.size()-1)) lis1.add(nums[i]);
            else lis2.add(nums[i]);
        }

        int idx = 0;
        int[] res = new int[nums.length];
        for(int i = 0; i < lis1.size(); i++){
            res[idx++] = lis1.get(i);
        }
        for(int i = 0; i < lis2.size(); i++){
            res[idx++] = lis2.get(i);
        }
        return res;
    }
}