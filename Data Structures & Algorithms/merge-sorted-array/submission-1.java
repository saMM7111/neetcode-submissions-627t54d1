class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j =0;
        for(int i = 0;i<nums1.length;i++){
            if(nums1[i]==0 && j<nums2.length){
                nums1[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
    }
}