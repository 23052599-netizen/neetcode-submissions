class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        // Count frequency of s1
        for (char ch : s1.toCharArray()) {
            s1freq[ch - 'a']++;
        }

        int i = 0, j = 0;

        while (j < m) {
            // Add current character (j)
            s2freq[s2.charAt(j) - 'a']++;

            // Shrink window if size > n
            if (j - i + 1 > n) {
                s2freq[s2.charAt(i) - 'a']--;
                i++;
            }

            // Check if permutation matches
            if (matches(s1freq, s2freq)) {
                return true;
            }

            j++;
        }

        return false;
    }

    // Compare both frequency arrays
    private boolean matches(int[] a, int[] b) {
        for (int k = 0; k < 26; k++) {
            if (a[k] != b[k]) return false;
        }
        return true;
    }
}