class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        return comb(nums,new ArrayList<>(),target,0);
    }

    public List<List<Integer>> comb(int [] arr, List<Integer> list, int target, int start){
        List<List<Integer>> result = new ArrayList<>();
        if(target == 0){
            result.add(list);
            return result;
        }
        if(target<0){
            return result;
        }
        for(int i=start;i<arr.length;i++){
            List<Integer> newlist = new ArrayList<>(list);
            newlist.add(arr[i]);
            result.addAll(comb(arr,newlist,target - arr[i], i));
        }
        return result;
    }
}
