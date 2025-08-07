// User function Template for Java

class Solution {
    long findBitwiseOR(long L, long R) {
        // code here
        while (L < R) {
            L = L | (L + 1);
        }
        return L;
    }
}