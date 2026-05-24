class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n  = arr.length;
        int l = 0;
        int r =n-1;
        while(r-l>=k){
            if(Math.abs(x-arr[l]) <= Math.abs(x-arr[r])){
                r--;
            }else{
                l++;

            }
        }
        List<Integer>res = new ArrayList<>();
        for(int i = l ; i<=r ; i++){
            res.add(arr[i]);
        }
        return res;

        
    }
}