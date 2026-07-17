class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        recur(0, new ArrayList<>(), ans, nums);

        return ans;
    }

    public void recur(int i, List<Integer> subset,
                      List<List<Integer>> ans, int[] nums) {

        if (i == nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }

        // Include nums[i]
        subset.add(nums[i]);
        recur(i + 1, subset, ans, nums);

        // Backtrack
        subset.remove(subset.size() - 1);

        // Skip duplicates
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }

        // Exclude nums[i]
        recur(i + 1, subset, ans, nums);
    }
}