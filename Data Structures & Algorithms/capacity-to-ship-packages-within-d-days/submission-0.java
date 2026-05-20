class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int max = 0;
        int sum = 0;

        // Find max weight and total sum
        for (int w : weights) {
            max = Math.max(max, w);
            sum += w;
        }

        int left = max;
        int right = sum;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // Helper function
    public boolean canShip(int[] weights, int days, int capacity) {

        int currentWeight = 0;
        int neededDays = 1;

        for (int w : weights) {

            if (currentWeight + w > capacity) {
                neededDays++;
                currentWeight = 0;
            }

            currentWeight += w;
        }

        return neededDays <= days;
    }
}