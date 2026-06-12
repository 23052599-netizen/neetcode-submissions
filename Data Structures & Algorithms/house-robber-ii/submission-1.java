class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] skipFirst = new int[n - 1]; //declare the array for skiping first house
        int[] skipLast = new int[n - 1]; //declare the array for skipping last house

        for (int i = 0; i < n - 1; i++) { //loop to iterate the no of houses

            skipFirst[i] = nums[i + 1];  //add the houses except first
            skipLast[i] = nums[i];     //add same except the last
        }

        int lootSkipFirst = robHouse(skipFirst); //call the helper function to give the max profit
        int lootSkipLast = robHouse(skipLast);  //same for this array

        return Math.max(lootSkipFirst, lootSkipLast); //now it will return the max from the 2 array
    }

    private int robHouse(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[n - 1];
    }
}
