// User function Template for Java

class Solution {
    int areMatricesIdentical(int N, int[][] Grid1, int[][] Grid2) {
        // code here
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int g1 = Grid1[i][j];
                int g2 = Grid2[i][j];
                if(g1!=g2){
                    return 0;
                }
            }
        }
        return 1;
    }
}