class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int e : arr){
            set.add(e);
        }
        for(int e : set){
            ans.add(e);
        }
        return ans;
    }
}