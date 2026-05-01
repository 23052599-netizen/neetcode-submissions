

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;

        // 1. Frequency map
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Min heap
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );

        // 3. Process map entries
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int value = entry.getKey();
            int freq = entry.getValue();

            pq.offer(new int[]{freq, value});

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // 4. Build result
        int[] result = new int[k];
        int i = 0;

        while (!pq.isEmpty()) {
            result[i++] = pq.poll()[1];
        }

        return result;
    }
}