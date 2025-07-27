

class Solution {
    public int DiagonalSum(int[][] matrix) {
        // code here
        int n = matrix.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=matrix[i][i];
        }
        int i=0, j=n-1;
        while(i<n && j>=0){
            sum+=matrix[i][j];
            i++;j--;
        }
        return sum;
    }
}