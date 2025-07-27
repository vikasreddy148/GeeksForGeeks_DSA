
class Solution {
  public:
    int squaresInMatrix(int m, int n) {
        // code here
        int count = 0;
        int m1 = min(m,n);
        for(int i=1;i<=m1;i++){
            count = count + (m-i+1)*(n-i+1);
        }
        return count;
    }
};