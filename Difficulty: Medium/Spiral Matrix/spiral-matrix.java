// User function Template for Java

class Solution {

    public int findK(int a[][], int n, int m, int k) {
        // Your code goes here
        
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                if(k==1){
                    return a[top][i];
                }
                k--;
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                if(k==1){
                    return a[i][right];
                }
                k--;
            }
            right--;

            // Traverse from right to left
            for (int i = right; i >= left && top <= bottom; i--) {
               
                if(k==1){
                    return a[bottom][i];
                }
                k--;
            }
            bottom--;

            // Traverse from bottom to top
            for (int i = bottom; i >= top && left <= right; i--) {
                if(k==1){
                    return a[i][left];
                }
                k--;
            }
            left++;
        }

        return -1;
        
    }
}