// User function Template for Java

class Solution {
    int onlyFirstAndLastAreSet(long n) {
        // code here.
        long temp = n;
        
        if((n&1)==0){
            return 0;
        }
        int setBits = 0;
        while(temp>0){
            if(setBits == 2) return 0;
            temp = temp & (temp-1);
            setBits++;
        }
        return 1;
    }
}
