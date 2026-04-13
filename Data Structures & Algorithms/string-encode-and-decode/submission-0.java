class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length()).append('#').append(strs.get(i));
        }
        return sb.toString();

    }

    public List<String> decode(String sb) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i<sb.length()){
            int j = sb.indexOf('#',i);
            int len = Integer.parseInt(sb.substring(i,j));
            result.add(sb.substring(j+1,j+1+len));
            i = j+1+len;
        }
        return result;
    }
}
