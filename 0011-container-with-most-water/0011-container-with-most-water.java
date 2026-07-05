class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,area=0,max_area=0;
        while(left < right){
          area=(right-left)* Math.min(height[left], height[right]);
            max_area=Math.max(max_area,area);
            if(height[left] < height[right])left++;
            else right--;

        }
        return max_area;
    }
}