class Solution {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stck = new Stack<>();

        for (int a : asteroids) {

            while (!stck.isEmpty() && a < 0 && stck.peek() > 0) {

                int sum = a + stck.peek();

                if (sum < 0) {
                    stck.pop();
                }
                else if (sum > 0) {
                    a = 0;
                }
                else {
                    stck.pop();
                    a = 0;
                }
            }

            if (a != 0) {
                stck.push(a);
            }
        }

        int[] res = new int[stck.size()];

        for (int i = stck.size() - 1; i >= 0; i--) {
            res[i] = stck.pop();
        }

        return res;
    }
}