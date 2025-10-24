class Solution {
    public static int digitalRoot1(int n) {
        if(n==0) return 0;
         return digitalRoot1(n/10)+n%10;
    }
    public static int digitalRoot(int n) {
        // code here
        if(n==0) return 0;
         int n1 = digitalRoot(n/10)+n%10;
       return digitalRoot1(n1);
        
        
    }
}