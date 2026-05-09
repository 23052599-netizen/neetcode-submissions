class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        int n = nums.length;
        Set<Integer>ans = new HashSet<>();
        for(int num : nums){
            if(ans.contains(num)){
              return true;  
            }
            ans.add(num);
        }
        return false;
    }
}