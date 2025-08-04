class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int n = arr.length;
        int odd = arr[0];
        for(int i=1;i<n;i++){
            odd = odd ^ arr[i];
        }
        return odd;
    }
}