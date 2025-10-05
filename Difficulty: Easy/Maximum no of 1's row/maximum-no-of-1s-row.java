// User function Template for Java

class Sol {
    public static int maxOnes(int Mat[][], int N, int M) {
        // your code here
        int maxCount = Integer.MIN_VALUE;
        int minCol = 0;
        for(int i = 0;i<N;i++){
            int count = 0;
            for(int j = 0;j<M;j++){
                if(Mat[i][j] == 1) count++;
            }
            if(count>maxCount){
                maxCount = count;
                minCol = i;
            }
        }
        return minCol;
    }
}