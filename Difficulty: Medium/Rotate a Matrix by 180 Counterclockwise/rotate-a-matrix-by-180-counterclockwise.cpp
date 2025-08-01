class Solution {
  public:
    void rotateMatrix(vector<vector<int>>& mat) {
        // Code here
        int n = mat.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(mat[i][j],mat[j][i]);
            }
        }
        
        for(int i=0;i<n;i++){
          int s=0,e=n-1;
          while(s<=e){
              swap(mat[i][s],mat[i][e]);
              s++;e--;
          }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(mat[i][j],mat[j][i]);
            }
        }
        
        for(int i=0;i<n;i++){
          int s=0,e=n-1;
          while(s<=e){
              swap(mat[i][s],mat[i][e]);
              s++;e--;
          }
        }
    }
};