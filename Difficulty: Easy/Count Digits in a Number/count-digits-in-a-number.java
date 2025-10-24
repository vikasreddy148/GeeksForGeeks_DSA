class Solution {
    public static int countDigits(int n) {
        // Code here
        if(n==0){
            return 0;
        }
        return countDigits(n/10)+1;
    }
}
