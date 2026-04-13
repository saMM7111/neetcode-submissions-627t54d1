class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int a [] = new int[n];

        a[0] = 1;
        for(int i =1;i<nums.length;i++){
            a[i] = a[i-1]*nums[i-1];
        }

        int mult = 1;
        for(int i =n-1;i>=0;i--){
            a[i] = a[i]*mult;
            mult *=nums[i];
        }
        return a;
    }
}