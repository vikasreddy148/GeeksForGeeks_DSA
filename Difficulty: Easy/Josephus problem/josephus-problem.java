class Solution {
    
    public int josephus(int n, int k) {
        // code here
        if(n==1){
            return 1;
        }
        int t = josephus(n-1,k)+k;
        if(t%n==0){
            return n;
        }
        else{
            return t%n;
        }
    }
}