

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has occurred once
        map.put(0, 1);

        int prefix = 0;
        int count = 0;

        for (int num : nums) {

            prefix += num;

            // If (prefix - k) exists,
            // then there is a subarray ending here with sum = k.
            count += map.getOrDefault(prefix - k, 0);

            // Store/update current prefix sum
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}