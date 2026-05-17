class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> seen = new ArrayList<>();
        int j = nums.length;
        for(int n : nums){
            if(n != val){
                seen.add(n);
            }
        }
        for(int i = 0 ; i<seen.size() ;i++){
            nums[i] = seen.get(i);
        }
        return seen.size();

           
    }
        
    
}