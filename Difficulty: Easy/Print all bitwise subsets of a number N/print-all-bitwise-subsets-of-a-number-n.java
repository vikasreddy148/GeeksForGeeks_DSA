// User function Template for Java

class Solution {

    ArrayList<Integer> printSubsets(int N) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=N;i>=0;i--){
            if((N&i)==i){
                ans.add(i);
            }
        }
        return ans;
    }
}
