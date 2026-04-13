class Solution {
    public boolean lemonadeChange(int[] nums) {
        int five = 0;
        int ten = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==5){
                five++;
            }

            if(nums[i]==10){
                if(five == 0)return false;
                five--;
                ten++;
            }

            if(nums[i]==20){
                if(five>0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >=3){
                    five -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}