



class Solution {

    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        HashMap<Integer, Integer> mop = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int req = target - nums[i];

            if (mop.containsKey(req)) {
                return new int[]{mop.get(req), i};
            }

            mop.put(nums[i], i);
        }

        return new int[]{};
    
    }
}