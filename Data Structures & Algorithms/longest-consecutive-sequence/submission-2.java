
class Solution {
    public int longestConsecutive(int[] nums) {

int longestLength = 0;

        // Map to track whether a number is explored or not
        Map<Integer, Boolean> exploredMap = new HashMap<>();

        // Step 1: Initialize all numbers as unexplored
        for (int num : nums) {
            exploredMap.put(num, false);
        }
        for (int num : nums) {
         int currentLength = 1;   

            // 🔼 Check in forward direction
            int nextNum = num + 1;
            while (exploredMap.containsKey(nextNum) && !exploredMap.get(nextNum)) {
                currentLength++;
                exploredMap.put(nextNum, true);
                nextNum++;
            }

            // 🔽 Check in backward direction
            int prevNum = num - 1;
            while (exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)) {
                currentLength++;
                exploredMap.put(prevNum, true);
                prevNum--;
            }

            // Update longest length
            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }
}