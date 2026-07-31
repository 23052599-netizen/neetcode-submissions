class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        int left = 0;
        Set<Character>seen = new HashSet<>();
        for(int right = 0 ; right<n ;right++){
            while(seen.contains(s.charAt(right))){
                
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            res =  Math.max(res,right-left+1);

            
        }
        
        return res;
    }
}