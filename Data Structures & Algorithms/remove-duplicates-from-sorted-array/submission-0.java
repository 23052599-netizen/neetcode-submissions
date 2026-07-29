class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;  // slow pointer: position for next unique element (index 0 is always unique)

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[k-1]){
                continue;
            
            }else if(nums[i] != nums[k - 1]) {   // found a new unique value
                nums[k] = nums[i];
                k++;
            }
        }

        return k;  // number of unique elements
    }
}