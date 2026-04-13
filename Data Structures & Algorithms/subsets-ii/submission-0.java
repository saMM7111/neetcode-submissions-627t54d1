class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0; i<nums.length;i++){
            start = 0;
            if(i>0 && nums[i]==nums[i-1]){
                start = end+1;
            }

            end = a.size()-1;
            int size = a.size();
            for(int j = start;j<size;j++){
                List<Integer> b = new ArrayList<>(a.get(j));
                b.add(nums[i]);
                a.add(b);
            }
        }
        return a;
    }
}
