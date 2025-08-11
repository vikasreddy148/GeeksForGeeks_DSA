// User function Template for Java

class Solution {
    public static long countKdivPairs(int arr[], int n, int k) {
        // code here
        long c = 0;
        for(int i=0;i<n;i++){
            arr[i] = arr[i]%k;
        }
        
        int fArr[] = new int[k];
        
        for(int i =0;i<n;i++){
            int a = arr[i];
            int b = k-a;
            if(a==0){
                b = 0;
            }
                
            c = c+fArr[b];
            fArr[a]++;
            
            
            
        }
        return c;
    }
}