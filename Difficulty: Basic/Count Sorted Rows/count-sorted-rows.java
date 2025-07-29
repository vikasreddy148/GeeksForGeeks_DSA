// User function Template for Java

class Solution {
    boolean sorted(int Mat[]){
        boolean inc = true;
        boolean dec = true;
        
        for(int j=1;j<Mat.length;j++){
            if(Mat[j-1]<=Mat[j]) inc = false;
            if(Mat[j-1]>=Mat[j]) dec = false;
        }
        return inc || dec;
    }
    int sortedCount(int N, int M, int Mat[][]) {
        // code here
        int count =0;
        for(int i=0;i<N;i++){
            if(sorted(Mat[i])){
                count++;
            }
        }
        return count;
    }
};