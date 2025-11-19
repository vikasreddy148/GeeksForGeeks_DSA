class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        int p1 = 0;
        int p2 = -1;
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        while(p2<n){
            if(map.size()==p2-p1+1){
                ans = Math.max(ans,map.size());
                p2++;
                if(p2==n) break;
                map.put(s.charAt(p2),map.getOrDefault(s.charAt(p2),0)+1);
            }else{
                
                map.put(s.charAt(p1),map.get(s.charAt(p1))-1);
                
                if(map.get(s.charAt(p1)) == 0){
                    map.remove(s.charAt(p1));
                }
                
                p1++;
            }
        }
        return ans;
        
    }
}