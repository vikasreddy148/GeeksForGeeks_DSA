// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        long sum = 0;
        long maxSum = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxSum = Math.max(sum,maxSum);
        int s=1,e=k;
        while(e<arr.length){
            sum = sum - arr[s-1]+arr[e];
            maxSum = Math.max(maxSum,sum);
            s++;
            e++;
        }
        return (int)maxSum;
    }
}