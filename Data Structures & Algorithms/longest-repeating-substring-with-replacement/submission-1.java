class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int count = 1;
        int maxfreq = 0;
        int left = 0;

        HashMap<Character,Integer>map = new HashMap<>();
        
        for(int right = 0 ; right<n ; right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            maxfreq  = Math.max(maxfreq,map.get(s.charAt(right)));

            while((right-left+1) - maxfreq >k ){
                char l = s.charAt(left);
                map.put(s.charAt(left) , map.getOrDefault(s.charAt(left),0)-1);
                left++;


            }
            count = Math.max(count,right-left+1);
        }
        return count;

    }
}
