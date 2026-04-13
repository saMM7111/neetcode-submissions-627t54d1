class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxI = 0;
        int maxJ = 0;
        int area = 0;
        while(i<j){
            if(height[i]<height[j]){
                if(height[i]>=maxI){
                    maxI = height[i];
                }else{
                    area += maxI-height[i];
                }
                i++;
            }
            else{
                if(height[j]>=maxJ){
                    maxJ = height[j];
                }else{
                    area += maxJ-height[j];
                }
                j--;
            }
        }
        return area;
    }
}
