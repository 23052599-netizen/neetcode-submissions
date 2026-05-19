class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        int boats = 0;

        while (left <= right) {

            // If lightest + heaviest can fit together
            if (people[left] + people[right] <= limit) {
                left++;
            }

            // Always take the heaviest person
            right--;

            boats++;
        }

        return boats;
    }
}