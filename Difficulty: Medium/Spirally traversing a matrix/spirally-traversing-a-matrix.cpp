class Solution {
  public:
    vector<int> spirallyTraverse(vector<vector<int>> &mat) {
        // code here
         
       
       int n = mat.size();
       int m = mat[0].size();
       vector<int> ans;
       int top =0;
       int bottom = n-1;
       int left = 0;
       int right = m-1;
    while(top<=bottom && left<=right){
       for(int i=left;i<=right;i++){
           ans.push_back(mat[top][i]);
       }
       top++;
       for(int i=top;i<=bottom;i++){
           ans.push_back(mat[i][right]);
       }
       right--;
       for(int i=right;i>=left && top<=bottom;i--){
           ans.push_back(mat[bottom][i]);
       }
       bottom--;
       for(int i=bottom; i>=top && left<=right;i--){
           ans.push_back(mat[i][left]);
       }
       left++;
       }
       return ans;
    }
};