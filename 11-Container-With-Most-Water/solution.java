public class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int length = height.length;
        int start = 0;
        int end = length-1;
        int maxArea = 0;
        while(start<end){
            maxArea = (end-start)*Math.min(height[end], height[start]);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;
    }
}