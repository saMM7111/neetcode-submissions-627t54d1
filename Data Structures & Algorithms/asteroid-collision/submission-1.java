class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack <Integer> stack = new Stack<>();
        for(int i = 0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[i]<0 && stack.peek()>0){
                if(stack.peek() == -nums[i]){
                    stack.pop();
                    nums[i] = 0;
                    break;
                }else if(stack.peek() > -nums[i]){
                    nums[i] = 0;
                }else{
                    stack.pop();
                    
                }
            }

            if(nums[i]!=0){
                stack.push(nums[i]);
            }
             
        }

        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.get(i);  
        }

        return arr;
    }
}