class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int a = -1, b=-1;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
               a = i;
            }
            if(arr[i]==y){
                
                b = i;
            }
        if(a != -1 && b !=-1){
        minDiff= Math.min(minDiff,Math.abs(a-b));
        }
        }
        if(a==-1 || b==-1){
            
            return -1;
        }
        
        return minDiff;
    }
}