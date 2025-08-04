class Solution {
    public int findUnique(int[] arr) {
        // code here
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
}