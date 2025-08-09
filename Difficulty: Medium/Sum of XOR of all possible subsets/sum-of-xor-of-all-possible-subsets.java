// User function Template for Java
class Solution {
    int subsetXORSum(int arr[]) {
        // code here
        int n = arr.length;
        int orAll = 0;
        for(int i=0;i<n;i++){
            orAll = orAll | arr[i];
        }
        return orAll * (1 << (n - 1));
        
        
    }
}