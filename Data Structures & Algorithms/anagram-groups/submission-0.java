class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean [] visited = new boolean[strs.length];
        
        String[] s = new String[strs.length];

        for(int i = 0;i<strs.length;i++){
            s[i] = sortString(strs[i]);
        }

        for(int i = 0;i<strs.length;i++){
            if(visited[i])continue;

            List<String> similar = new ArrayList<>();
            similar.add(strs[i]);
            for(int j = i+1;j<strs.length;j++){
                if(s[i].equals(s[j])){
                    similar.add(strs[j]);
                    visited[j] = true;
                }
            }
            result.add(similar);
        }
        return result; 
    }

    public String sortString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String s = new String(chars);
        return s;
    }
}
