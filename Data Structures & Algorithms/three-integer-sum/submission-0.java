class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       Arrays.sort(nums);
       // [-4, -1, -1, 0, 1, 2]
       
        for(int i=0;i<nums.length;i++) {
            int l=i+1, r=nums.length-1;

            if(i>0 && nums[i] == nums[i-1]) continue;

            while(l<r){
                if(nums[i]+nums[l]+nums[r] == 0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
                else if(nums[i]+nums[l]+nums[r]>0) {
                    r--;
                }
                else {
                    l++;
                }
            }
            // for(int j=i+1;j<nums.length;j++) {
            //     for(int k=j+1;k<nums.length;k++) {
            //         if(nums[i]+nums[j]+nums[k] == 0) {
            //             List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
            //             res.add(temp);
            //         }
            //     }
            // }
        }
        return res;
    }
}
