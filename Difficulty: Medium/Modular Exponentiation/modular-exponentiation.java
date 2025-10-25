class Solution {
    public int powMod(int x, int n, int M) {
        // code here
        if(n==0) return 1;
        long t =  powMod(x,n/2,M);
        long res = (t*t)%M;
        if(n%2==0){
            
            return (int)res;
            
        }else{
            
            return (int)(res * x%M)%M;
        }
        
    }
}