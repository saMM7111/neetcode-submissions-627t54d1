class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> list= new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            list.add(nums[i]);
        }

        int longest = 0;
        for(int i = 0;i<nums.length;i++){
            if(!list.contains(nums[i]-1)){
                int currentStreak = 1;
                for(int currentNum = nums[i];list.contains(currentNum + 1);currentNum++){
                    currentStreak++;
                }
                longest = Math.max(longest,currentStreak);
            }
        }
        return longest;
    }
}
