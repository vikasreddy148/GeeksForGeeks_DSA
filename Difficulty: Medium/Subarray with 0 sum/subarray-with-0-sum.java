class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int[] psum = new int[arr.length];
        psum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            psum[i] = psum[i-1]+arr[i];
        }
        for(int e : psum){
            if(set.contains(e)){
                return true;
            }else{
              set.add(e);  
            }
            
        }
        return false;
    }
}