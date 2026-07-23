class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer>st = new HashSet<>();
        for(int np : nums){
            if(st.contains(np)){
                return true;
            }
            st.add(np);
        }
        return false;

        
     
    }
}