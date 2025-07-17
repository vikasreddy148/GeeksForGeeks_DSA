class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int n = arr.length;
        long sum = 0;
        long[] pSum = new long[n];
        for(int i=0;i<n;i++){
        sum+=arr[i];
        pSum[i]=sum;
            
        }
        if(sum%2!=0){
            return false;
        }
        for(int i=0;i<n;i++){
            if(pSum[i]==sum/2){
                return true;
            }
        }
        return false;
    }
}