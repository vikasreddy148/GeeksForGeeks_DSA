class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int mat[][] = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>i){
                    mat[i][j]=0;
                }else if(j==0){
                    mat[i][j]=1;
                }else{
                    mat[i][j]=mat[i-1][j]+mat[i-1][j-1];
                }
                
            }
        }
        for(int i=0;i<mat[0].length;i++){
            ans.add(mat[n-1][i]);
        }
        return ans;
    }
}