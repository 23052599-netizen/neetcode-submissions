

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> seen = new HashMap<>();
        for(int num  :  nums){
            seen.put(num,seen.getOrDefault(num,0) +1);

        }
        List<Integer>[]bucket = new List[nums.length+1];
        for(int key:seen.keySet()){
            int freq = seen.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[]res = new int[k];
        int counter = 0;

        for(int pos = bucket.length-1 ; pos>=0 && counter<k ; pos--){
            if(bucket[pos] != null){
                for(int integer : bucket[pos]){
                    res[counter++] = integer;
                    if(counter == k){
                        break;
                    }
                }
            }

        }
        return res;




    }
}