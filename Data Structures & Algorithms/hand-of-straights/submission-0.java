class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n % groupSize!=0)return false; 

        Arrays.sort(hand);
        boolean [] arr = new boolean[n];

        for(int i =0;i<n;i++){
            if(arr[i])continue;

            int current = hand[i];
            int count = 1;

            for(int j = i+1;j<n && count < groupSize;j++){
                if(arr[j])continue;

                if(hand[j] == current+1){
                    arr[j] = true;
                    current = hand[j];
                    count++;
                }
            }

            if(count != groupSize)return false;
        }
        return true;
    }
}
