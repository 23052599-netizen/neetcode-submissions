class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        int n = nums.length;
        
        
        recur(new ArrayList<>() , nums , ans , new boolean[n]);
        return ans;
        
    }
    public void recur( List<Integer>prem , int[]nums , List<List<Integer>>ans , boolean[]pick ){
        if(prem.size() == nums.length){
            ans.add(new ArrayList<>(prem));
            return;
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(!pick[i]){
                prem.add(nums[i]);
                pick[i] = true;
                recur(prem , nums ,ans, pick);
                prem.remove(prem.size()-1);
                pick[i] = false;
            }

        }


    }
}
