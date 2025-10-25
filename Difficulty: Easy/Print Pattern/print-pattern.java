class Solution {
    public void decPattern(int n,ArrayList<Integer> ans){
        if(n<=0){
            ans.add(n);
            return ;
        }
        
          ans.add(n);  
    
        decPattern(n-5,ans);
        
           ans.add(n); 
        
        
    }
    public ArrayList<Integer> pattern(int n) {
        // code here
        int cn = n;
        ArrayList<Integer>  ans = new ArrayList<>();

        decPattern( n,ans);
        return ans;
    }
}