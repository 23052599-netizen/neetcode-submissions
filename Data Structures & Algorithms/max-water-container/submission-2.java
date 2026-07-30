class Solution {
    public int maxArea(int[] heights) {
      int n = heights.length;
      int left = 0;
      int right = n-1;
      int maxlen = 0;
      while(left<right){

      int width = right-left;
      int height = Math.min(heights[left],heights[right]);
      maxlen = Math.max(width*height , maxlen);
        
      
      if(heights[left]<heights[right]){
        left++;
      }else{
        right--;
      }
      }
      return maxlen;
    }
}