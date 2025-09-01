class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        long pSum[] = new long[arr.length];
        HashMap<Long,Integer> map = new HashMap<>();
        
        pSum[0] = arr[0];
        
        for(int i=1;i<arr.length;i++){
            pSum[i] = pSum[i-1]+arr[i];
        }
       long g = 0;
       map.put(g,1);
        int count = 0;
       for(long e : pSum){
           if(map.containsKey(e)){
               count = count + map.get(e);
           }
           map.put(e,map.getOrDefault(e,0)+1);
       }
        
        return count;
    }
}
