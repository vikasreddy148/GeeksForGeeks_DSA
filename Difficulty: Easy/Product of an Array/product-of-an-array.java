/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        // your code here
        int n = arr.length;
        long m = 1000000007;
        long p = 1;
        for(int i=0;i<n;i++){
           p = (p*arr[i])%m;
        }
        
        
        return (p%m+m)%m;
    }
}