class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
       
        for(int i =0 ; i<n ;i++){
             Set<Character>seen = new HashSet<>();
             for(int j = i ; j<n ; j++){
                if(seen.contains(s.charAt(j))){
                    break;
                }
                seen.add(s.charAt(j));
             }
             res = Math.max(res,seen.size());
        }
        return res;
    }
}
