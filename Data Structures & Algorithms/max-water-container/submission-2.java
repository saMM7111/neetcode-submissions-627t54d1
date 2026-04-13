class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int max = 0;
        int area =0;
        while(i<j){
            if(heights[i]<heights[j]){
                area = (j-i)*heights[i];
                i++;
            }else{
                area = (j-i)*heights[j];
                j--;
            }

            max = Math.max(max,area);
        }
        return max;
    }
}
