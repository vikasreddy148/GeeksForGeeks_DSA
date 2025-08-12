class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            arr[i]--;
        }
        for(int i=0;i<n;i++){
            arr[arr[i]%n]+=n;
        }
        for(int i=0;i<n;i++){
            ans.add(arr[i]/n);
        }
        return ans;
    }
}
