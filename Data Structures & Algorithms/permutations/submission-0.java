class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        boolean[] pick = new boolean[nums.length];

        backtrack(res, perm, nums, pick);

        return res;

    }

    public void backtrack(List<List<Integer>> res, List<Integer> perm, int[] nums, boolean[] pick) {
        if(perm.size() == nums.length) {
            res.add(new ArrayList<>(perm));
        }


        for(int i=0;i<nums.length;i++){
            if(!pick[i]) {
                perm.add(nums[i]);
                pick[i] = true;
                backtrack(res, perm, nums, pick);
                perm.remove(perm.size() - 1);
                pick[i] = false;

    }
}

    } }
