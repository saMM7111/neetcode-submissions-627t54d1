class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1)return nums;
        Arrays.sort(nums);

        List<int[]> list = new ArrayList<>();
        int count =1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                list.add(new int[]{nums[i-1],count});
                count=1;
            }
        }

        list.add(new int[]{nums[nums.length-1],count});

        list.sort((a,b)->b[1]-a[1]);

        int [] a = new int[k];
        for(int i=0;i<k;i++){
            a[i] = list.get(i)[0];
        }
        return a;
     }
}