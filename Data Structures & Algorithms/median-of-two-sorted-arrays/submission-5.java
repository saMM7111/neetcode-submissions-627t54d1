class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int start = 0;
        int end = m;
        double median = 0;
        while(start<=end){
            int i = start+(end-start)/2;
            int j = (m+n+1)/2 - i;
            int left1,right1,left2,right2;
            if(i==0){
                left1 = Integer.MIN_VALUE;
            }else{
                left1 = nums1[i-1];
            }

            if(i==m){
                right1 = Integer.MAX_VALUE;
            }else{
                right1=nums1[i];
            }

            if(j==0){
                left2 = Integer.MIN_VALUE;
            }else{
                left2 = nums2[j-1];
            }

            if(j==n){
                right2 = Integer.MAX_VALUE;
            }else{
                right2=nums2[j];
            }


            if(left1<=right2 && left2<=right1){
                if((m+n)%2==0){
                    int leftmax = Math.max(left1,left2);
                    int rightmin = Math.min(right1,right2);
                    return ((double)(leftmax+rightmin)/2.0);
                }else{
                    return (double)(Math.max(left1,left2));
                }
            }else if(left1>left2){
                end = i-1;
            }else{
                start = i+1;
            }
        }
        return 0;
    }
}
