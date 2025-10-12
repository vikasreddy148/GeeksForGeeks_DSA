class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ans.add(map.size());
        int s = 1,e = k;
        while(e<arr.length){
            map.put(arr[s-1],(map.get(arr[s-1])-1));
            if((map.get(arr[s-1])) == 0){
                map.remove(arr[s-1]);
            }
            map.put(arr[e],map.getOrDefault(arr[e],0)+1);
            
            ans.add(map.size());
            e++;s++;
        }
        return ans;
    }
}