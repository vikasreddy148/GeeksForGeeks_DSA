// User function Template for Java

class Solution {
    static int countUnsetBits(int n, int l, int r) {
        // code here
        int ans = 0;
        for(int i = l;i<=r;i++){
            int bit = (n>>i-1)&1;
            if(bit != 1) ans++;
        }
        return ans;
    }
};