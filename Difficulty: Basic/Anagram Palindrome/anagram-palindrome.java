class Sol {
    int isPossible(String S) {
        // your code here
        HashMap<Character,Integer> map = new HashMap<>();
        int n = S.length();
        for(int i=0;i<n;i++){
            char ch = S.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int oddCount = 0;
        for (char key : map.keySet()) {
        if(map.get(key)%2!=0){
            oddCount++;
        }
       }   
        
        return oddCount<=1 ? 1: 0;
    }
}