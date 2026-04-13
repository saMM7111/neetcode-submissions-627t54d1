class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int arr [][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            if(arr[start][0]+arr[end][0]<target){
                start++;
            }else if(arr[start][0]+arr[end][0]>target){
                end--;
            }
            else{
                int i1 = arr[start][1];
                int i2 = arr[end][1];
                if(i1>i2){
                    int temp = i1;
                    i1 = i2;
                    i2 = temp;
                }
                return new int[]{i1,i2};
            }
        }
        return new int[]{-1,-1};
    }
}
