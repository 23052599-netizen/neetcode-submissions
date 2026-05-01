class Solution {
    public int maxArea(int[] heights) {
       int  n = heights.length;
       int maxlen = 0 ;
       int left = 0;
       int right = n-1;
       while(left<right){
        int width = right - left;
        int height = Math.min(heights[right] , heights[left]);
        maxlen = Math.max(maxlen , width*height);
       
       if(heights[left]<=heights[right]){
        left++;
       }else{
        right--;
       }
    }
       return maxlen;
    }
}