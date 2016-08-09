public class Solution {
    public int maxArea(int[] height) {
        if(height==null||height.length==0){
            return 0;
        }
        int length = height.length;
        int maxArea = 0;
        int start = 0;
        int end = length-1;
        while(start < end){
            int heig = Math.min(height[start], height[end]);
            int area = (end-start)*heig;
            maxArea = Math.max(maxArea, area);
            if(height[start]==heig){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;
    }
}