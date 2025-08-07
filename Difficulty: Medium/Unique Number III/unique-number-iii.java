// User function Template for Java

class Solution {
    public int getSingle(int[] arr) {
        // code here
        int n = arr.length;
        int unique = 0;
        for(int i=0;i<32;i++){
            int c = 0;
            for(int k=0;k<n;k++){
                int bit = (arr[k]>>i)&1;
                if(bit == 1){
                    c++;
                }
            }
            if(c%3!=0){
               unique = unique| (1<<i); 
            }
           
        }
        return unique;
    }
}