// User function Template for Java

class Solution {
    int sortedCount(int N, int M, int Mat[][]) {
        // code here
        int totalCount = 0;
        for(int i = 0;i<N;i++){
            int incCount = 0, decCount = 0;
            for(int j = 0;j<M-1;j++){
                if(Mat[i][j]<Mat[i][j+1]) incCount++;
                else if(Mat[i][j]>Mat[i][j+1]) decCount++;
            }
            if(incCount == M-1) totalCount ++;
            else if(decCount == M - 1) totalCount ++;
        }
        return totalCount;
    }
};