// User function Template for Java

class Solution {
    // Function to get the index of an element in a sorted array
    public int getIndexInSortedArray(int[] arr, int k) {
        // Write Code Here
        int c = 0;
        int num = arr[k];
        for(int i=0;i<=k;i++){
            if(arr[i]==arr[k]){
                c++;
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(c!=0 && arr[i] == num){
                c--;
            }
            if(c == 0 && arr[i] == num){
                return i;
            }
            
        }
        return -1;
    }
}
