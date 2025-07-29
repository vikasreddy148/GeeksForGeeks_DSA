class Solution {
    public int[] findStartingPoint(int x, int y, int[][] pathCoordinates) {
        // Code here
        int i = pathCoordinates.length-1;
        
        while(i>=0){
            int j =0;
            x -= pathCoordinates[i][j];
            j++;
            y -= pathCoordinates[i][j];
            i--;
        }
        return new int[] {x,y};
    }
}