// User function Template for Java

class Solution {

    public int shortestUnorderedSubarray(int arr[]) {
        int p_idx = 0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                p_idx = i;
            }
        }
        int ans = p_idx>0?3:0;
        return ans;
    }
}