

// User function Template for Java

class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int n = arr.length;
        int ans = 0;
        
        for(int i=0;i<n;i++){
            ans +=arr[i]* (i+1) * (n-i);
        }
        
        return ans;
    }
}
