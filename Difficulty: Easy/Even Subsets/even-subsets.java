class Solution {
    public int countSumSubsets(int[] arr, int n) {
        // Code here
        int c =0;
        int l = (int)Math.pow(2,n);
        for(int i=0;i<l;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                int bit = (i>>j)&1;
                if(bit==1){
                    sum+=arr[j];
                }
            }
            if(sum%2==0){
                c++;
            }
        }
        return c-1;
    }
}