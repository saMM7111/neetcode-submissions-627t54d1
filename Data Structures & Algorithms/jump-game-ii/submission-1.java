class Solution {
    public int jump(int[] nums) {
        int length=0;
        int end = 0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            length = Math.max(length,nums[i]+i);
            if(i==end){
                count++;
                end = length;
                if(length >= nums.length-1) break;
            }
        }
        return count;
    }
}
