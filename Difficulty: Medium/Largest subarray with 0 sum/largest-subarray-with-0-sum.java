class Solution {
    int maxLength(int arr[]) {
        // code here
        int n = arr.length;
        int pSum[] = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        pSum[0]=arr[0];
        int ans = 0;
        for(int i=1;i<n;i++){
            pSum[i]=pSum[i-1]+arr[i];
        }
        map.put(0,-1);
        for(int i=0;i<n;i++){
            int key = pSum[i];
            if(!map.containsKey(key)){
             map.put(pSum[i],i);
            }
        }
        for(int i=0;i<n;i++){
            int key = pSum[i];
            if(map.containsKey(key)){
                ans = Math.max(ans,i-map.get(key));
            }
            
        }
        return ans;
    }
}