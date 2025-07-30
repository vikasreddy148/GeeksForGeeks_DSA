class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        int n = mat.length;
        int m = mat[0].length;
        if(n==1 && m==1){
            ans.add(mat[0][0]);
        }
        for(int l=1;l<m;l++){
            ans.add(mat[i][j]);
            j++;
        }
        for(int l=1;l<n;l++){
            ans.add(mat[i][j]);
            i++;
        }
        for(int l=1;l<m;l++){
            ans.add(mat[i][j]);
            j--;
        }
        for(int l=1;l<n;l++){
            ans.add(mat[i][j]);
            i--;
        }
        
        return ans;
    }
}
