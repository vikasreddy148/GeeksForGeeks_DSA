class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int bit = arr[i] ^ i+1;
            if(bit != 0) return i+1;
        }
        return arr.length+1;
    }
}