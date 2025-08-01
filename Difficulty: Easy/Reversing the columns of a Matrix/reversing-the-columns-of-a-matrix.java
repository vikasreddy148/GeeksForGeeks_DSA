class Solution {
    // Function to reverse the columns of a matrix.
    static void reverseCol(int mat[][]) {
        // code here
        
        int n = mat.length;
        for(int i=0;i<n;i++){
          int m = mat[i].length;
            int s=0,e=m-1;
            if(m>=0){
            while(s<=e){
                int temp = mat[i][s];
                mat[i][s] = mat[i][e];
                mat[i][e] = temp;
                e--;s++;
            }
            m--;
            }
        }
    }
}
