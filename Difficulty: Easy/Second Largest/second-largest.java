class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = arr[0], secondlargest = -1;
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                 secondlargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest = arr[i];
            }
        } 
        
        return secondlargest;
    }
}