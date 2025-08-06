class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        int n = arr.length;
        int xor =0;
        for(int i=0;i<n;i++){
            xor = xor ^ arr[i];
        }
        int p = 0;
        for(int i=0;i<32;i++){
            int bit = (xor>>i)&1;
            if(bit==1){
                break;
            }
            p++;
        }
        int set = 0, unset = 0;
        for(int i=0;i<n;i++){
            int bit = (arr[i]>>p)&1;
            if(bit == 1){
                    set = set ^ arr[i];
            }else{
                    unset = unset ^ arr[i];
            }
        }
        if(set<unset){
            return new int [] {set,unset};
        }
        return new int[] {unset,set};
    }
}