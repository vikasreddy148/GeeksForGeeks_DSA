// User function Template for Java

class Solution {
    static void dsum(int i,int j,int A[][], ArrayList<Integer>ans){
        int n = A.length;
        while(i<n && j>=0){
            ans.add(A[i][j]);
            i++;j--;
        }
    }
    static ArrayList<Integer> downwardDiagonal(int N, int A[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.length;
        for(int j=0;j<n;j++){
            dsum(0,j,A,ans);
        }
        
        for(int i = 1;i<n;i++){
            dsum(i,n-1,A,ans);
        }
        return ans;
    }
}
