class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] count = new int[26];

        int l = 0, r = 0;
        int maxfreq = 0;
        int res = 0;

        while (r < n) {
            // include current character
            count[s.charAt(r) - 'A']++;

            // update max frequency
            maxfreq = Math.max(maxfreq, count[s.charAt(r) - 'A']);

            // shrink window if invalid
            while ((r - l + 1) - maxfreq > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            // update result
            res = Math.max(res, r - l + 1);

            r++; // move right pointer
        }

        return res;
    }
}