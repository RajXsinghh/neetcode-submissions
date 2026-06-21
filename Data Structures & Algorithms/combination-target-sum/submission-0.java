class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> sum= new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        combi(0, nums, target ,sum, res);
        return res;
        
        
    }

    public void combi(int i, int[] nums, int target, List<Integer> sum, List<List<Integer>> res) {
        if(target == 0){
            res.add(new ArrayList<>(sum));
            return;
        }

        if(target<0 || i>=nums.length){
            return;
        }
        
        sum.add(nums[i]);
        combi(i, nums, target-nums[i], sum, res);
        sum.remove(sum.size()-1);
        combi(i+1,nums,target,sum, res);

    }
}
