// User function Template for Java
class Solution {
    static int count(int A, int B, int N) {
        // code here
        int res = 0;
        for(int i=A;i<=B;i++){
            int c = 0;
            for(int j=1;j*j<=i;j++){
                if (i % j == 0) {
                    if (j * j == i) c++; // perfect square
                    else c += 2;         // divisor pair
                }
            }
            if(c==N) res++;
        }
        return res;
    }
}