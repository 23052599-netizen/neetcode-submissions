class Solution {
    public boolean search(int[] nums, int target) {

        int n = nums.length;
        Set<Integer>seen = new HashSet<>();
        for(int num : nums){
            seen.add(num);
        }
        for(int i = 0 ; i<n ;i++){
            if((nums[i]) == target){
                return true;
            }
        }
        return false;

    }
}