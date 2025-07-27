// User function Template for Java

class Solution {
    int sumOfRowCol(int N, int M, int arr[][]) {
        // code here
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for(int i=0;i<N;i++){
            int rowSum = 0;
            for(int j=0;j<M;j++){
                rowSum+=arr[i][j];
            }
            row.add(rowSum);
        }
        for(int j=0;j<M;j++){
             int colSum = 0;
            for(int i=0;i<N;i++){
                colSum+=arr[i][j];
            }
            col.add(colSum);
        }
        if(row.equals(col))  return 1;
        
        return 0;
    }
}