
class Solution {
    public int longestConsecutive(int[] nums) {
    int count = 1;
    int maxi = 1;   
    Arrays.sort(nums);
    if(nums.length == 0){
        return 0;
    
    }
    for(int i = 1 ; i<nums.length ; i++){
        if(nums[i] == nums[i-1]+1){
            count++;
        }else if(nums[i] == nums[i-1]){
            continue;
        }else{
            count = 1;
           
        }
        maxi = Math.max(maxi,count);
        
        
    } 
    return  maxi;
    }
}