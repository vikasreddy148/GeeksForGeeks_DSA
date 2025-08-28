class Solution {
    public List<Integer> getDistinct(int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
               map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }else{
            int key = -arr[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)-1);
                if (map.get(key) == 0) {
                        map.remove(key);
                }
            }
            
            }
            ans.add(map.size());
        }
        
        
        return ans;
    }
}
