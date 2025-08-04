class Solution {
  public:
    int getFirstSetBit(int n) {
        // code here
        int shift = 0;
        if(n == 0) return 0;
        if(n%2!=0) return 1;
        while(true){
            if((n>>shift) & 1 == 1){
                return shift+1;
            } 
            
            shift++;
        }
        return 0;
    }
};