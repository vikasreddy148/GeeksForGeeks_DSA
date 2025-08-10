// User function Template for Java

class Complete {

    // Function for finding maximum and value pair
    public static long calculate(int arr[], int n) {
        // Complete the function
        Arrays.sort(arr);
        int c =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]!=arr[i]) break;
               int xor =  arr[i] ^ arr[j];
               if(xor==0){
                   c++;
               }
            }
        }
        return c;
    }
}
