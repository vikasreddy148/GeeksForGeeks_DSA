// User function Template for Java

class Solution {
    public int[] BoundaryElements(int[][] matrix) {
        // code here
       ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int n = matrix.length;
        if(n==1) return new int[] {matrix[0][0]};
        for(int l=0;l<n;l++){
            int num = matrix[i][l];
            list.add(num);
        }
        i++;
        while(i<n-1){
            list.add(matrix[i][0]);
            list.add(matrix[i][n-1]);
            i++;
        }
        for(int l=0;l<n;l++){
            int num = matrix[i][l];
            list.add(num);
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }
}