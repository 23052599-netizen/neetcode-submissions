class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] max = new int[n];

        max[0] = nums[0];
        max[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            max[i] = Math.max(nums[i] + max[i - 2], max[i - 1]);
        }

        return max[n - 1];
    }
}
