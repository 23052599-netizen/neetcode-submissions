class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        // Minimum possible speed
        int minSpeed = 1;

        // Find maximum pile size
        int maxSpeed = 0;
        for (int pile : piles) {
            maxSpeed = Math.max(maxSpeed, pile);
        }

        // Binary Search
        while (minSpeed < maxSpeed) {

            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            // Check if Koko can eat all bananas in h hours
            if (canEatInTime(piles, h, mid)) {
                maxSpeed = mid;
            } else {
                minSpeed = mid + 1;
            }
        }

        return minSpeed;
    }

    // Helper function
    private boolean canEatInTime(int[] piles, int h, int speed) {

        int hours = 0;

        for (int pile : piles) {

            // Calculate hours needed for this pile
            hours += (int) Math.ceil((double) pile / speed);
        }

        return hours <= h;
    }
}