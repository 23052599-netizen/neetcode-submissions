

class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        Arrays.sort(nums);

        dfs(0, new ArrayList<>(), 0, nums, target);

        return res;
    }

    private void dfs(int i,
                     List<Integer> cur,
                     int total,
                     int[] nums,
                     int target) {

        // Base Case
        if (total == target) {
            res.add(new ArrayList<>(cur));
            return;
        }

        // Try all numbers starting from index i
        for (int j = i; j < nums.length; j++) {

            // Pruning
            if (total + nums[j] > target) {
                return;
            }

            // Choose
            cur.add(nums[j]);

            // Explore
            dfs(j, cur, total + nums[j], nums, target);

            // Backtrack
            cur.remove(cur.size() - 1);
        }
    }
}