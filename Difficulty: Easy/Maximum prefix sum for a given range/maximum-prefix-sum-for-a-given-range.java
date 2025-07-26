class Solution {
    public List<Integer> maxPrefixes(List<Integer> arr, List<Integer> leftIndex,
                                     List<Integer> rightIndex) {
        // code here.
        ArrayList<Integer> ans  = new ArrayList<>();
       
        
        for(int i=0;i<rightIndex.size();i++){
            int s = leftIndex.get(i);
            int e = rightIndex.get(i);
            ans.add(ps(s,e,arr));
        }
        return ans;
    }
    public int ps(int s,int e,List<Integer> arr){
            int sum = 0;
            int maxSum = Integer.MIN_VALUE;
            for(int i=s;i<=e;i++){
                sum+=arr.get(i);
                if(sum>maxSum) maxSum = sum;
            }
            return maxSum;
        }
}
