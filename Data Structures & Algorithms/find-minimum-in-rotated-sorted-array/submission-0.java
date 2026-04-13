class Solution {
    public int findMin(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
           if (arr[start] < arr[end]) {
                return arr[start];
            }
            if(arr[mid]>=arr[start]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return arr[end];
    }
}