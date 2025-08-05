// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        System.out.print((num>>i-1)&1);
        System.out.print(" ");
        System.out.print((1<<i-1) | num);
        System.out.print(" ");
        System.out.print(~(1<<i-1) & num);
        
    }
}
