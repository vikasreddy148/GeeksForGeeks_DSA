class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int n = mat.length;
        
        int ans[] = new int[n];
        
        for(int i=0;i<n;i++){
            int m = mat[i].length;
            int sum = 0;
            for(int j=0;j<m;j++){
               sum=sum+mat[i][j]; 
            }
            ans[i] = sum;
        }
        return ans;
    }
}