// User function Template for Java

class Solution {
    int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        int lDSum=0;
        int rDSum=0;
        for(int i = 0;i<N;i++){
            lDSum+=Grid[i][i];
        }
        int i =0,j=N-1;
        while(j>=0 && i<N){
            rDSum+=Grid[i][j];
            i++;j--;
        }
        return Math.abs(lDSum-rDSum);
    }
}