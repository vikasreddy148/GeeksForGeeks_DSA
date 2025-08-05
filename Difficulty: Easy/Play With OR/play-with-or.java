// User function Template for Java

class Solution {

    // Function for finding maximum and value pair
    public static int[] game_with_number(int arr[], int n) {
        // Complete the function
        int ans[] = new int[n];
        for(int i=0;i<n-1;i++){
            int num = arr[i] | arr[i+1];
            ans[i]=num;
        }
        ans[n-1] = arr[n-1];
        return ans;
    }
}
