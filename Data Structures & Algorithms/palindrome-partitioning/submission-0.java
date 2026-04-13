class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        subString(0,s,result,new ArrayList<>());
        return result;
    }

    static void subString(int start, String s, List<List<String>> result, List<String> subString){
        if(start == s.length()){
            result.add(new ArrayList<>(subString));
            return;
        }

        for(int i=start;i<s.length();i++){
            if(isPalindrome(s,start,i)){
                subString.add(s.substring(start,i+1));
                subString(i+1,s,result,subString);
                subString.remove(subString.size()-1);
            }
        }
    }

    static boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--))return false;
        }
        return true;
    }
    
}