class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);

        }   
        List<Map.Entry<Integer,Integer>>List = new ArrayList<>(map.entrySet());
        List.sort((a,b) -> b.getValue() - a.getValue());
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = List.get(i).getKey();
        }

        return ans;

    }
}
