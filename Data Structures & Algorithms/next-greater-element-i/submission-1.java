class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> n1 = new HashMap<>();
        for(int i=0;i<nums1.length;i++) {
            n1.put(nums1[i], i);
        }

        int[] res = new int[nums1.length];
        for(int i=0;i<res.length;i++) {
            res[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while(!stack.isEmpty() && num > stack.peek()) {
               int val = stack.pop();
               int idx = n1.get(val);
               res[idx] = num;
            }
            if(n1.containsKey(num)) {
                stack.push(num);
            }
        }
        return res;
    }
}