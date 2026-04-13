class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] arr = Arrays.copyOf(nums, nums.length*2);
        
        int j = 0;
        for(int i=nums.length;i<arr.length;i++){
            arr[i] = nums[j];
            j++;
        }
        return arr;
    }
}