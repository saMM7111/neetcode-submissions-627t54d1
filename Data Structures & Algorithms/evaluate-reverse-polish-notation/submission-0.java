class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i =0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                switch(tokens[i]){
                    case "+": result = a+b;
                    break;
                    case "-": result = a-b;
                    break;
                    case "*": result = a*b;
                    break;
                    case "/": result = a/b;
                    break;
                }

                stack.push(result);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
