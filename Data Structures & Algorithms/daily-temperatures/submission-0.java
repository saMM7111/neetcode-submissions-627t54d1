class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] arr = new int[n];
        int count = 0;
        for(int i = 1;i<arr.length;i++){
            int j = i;
            count = 0;
            while(j<arr.length){
                count++;
                if(temperatures[i-1]<temperatures[j]){
                    break;
                }else{
                    j++;
                }
            }

            if(j == arr.length){
                arr[i-1] = 0;
            }else{
                arr[i-1] = count;
            }
        }
        return arr;
    }
}
