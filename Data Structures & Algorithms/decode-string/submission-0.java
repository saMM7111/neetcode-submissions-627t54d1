class Solution {
    public String decodeString(String s) {
        Stack <Integer> num = new Stack<>();
        Stack <String> str = new Stack<>();

        int currNum = 0;
        String currStr = "";

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                currNum = currNum*10 + (c -'0');
            }
            else if(s.charAt(i) == '['){
                num.push(currNum);
                str.push(currStr);
                currNum = 0;
                currStr = "";
            }else if(s.charAt(i) == ']'){
                int repeat = num.pop();
                String prev = str.pop();

                StringBuilder sb = new StringBuilder(prev);
                for(int j = 0;j<repeat;j++){
                    sb.append(currStr);
                }

                currStr = sb.toString();
            }else{
                currStr = currStr + c;
            }
        }
        return currStr;
    }
}