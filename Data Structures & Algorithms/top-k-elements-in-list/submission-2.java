class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int key = nums[i];
            if(!map.containsKey(key)){
                map.put(key,1);
            }else{
                map.put(key, map.getOrDefault(key,0)+1);
            }
        }

        int result[] = new int[k];

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        for(int i = 0;i<k;i++){
            result[i] = list.get(i).getKey();
        }
        return result;

    }
}
