class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Set<Integer> seen  = new HashSet<>();
        for(int num : nums){
            int count = 0;
            for(int i : nums){
                if(i == num) count++;
            }
            if (count > nums.length/3){
                seen.add(num);

            
            }
        }
        return new ArrayList<>(seen);

        
    }
}