class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> arr = new HashSet<>();
        int maxLen = 0;
        int left = 0;
         for(int right = 0;right<n;right++){

            while(arr.contains(s.charAt(right))){
                arr.remove(s.charAt(left));
                left++;
            }

            arr.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left +1);
         }
         return maxLen;
    }
}
