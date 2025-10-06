// User function Template for Java

class Solution {
    int sumOfRowCol(int N, int M, int A[][]) {
        // code here
        int minCheck = Math.min(N,M);
        for(int i = 0;i<minCheck;i++){
            int rSum = 0, cSum = 0;
            //row sum
            for(int j = 0;j<M;j++) rSum += A[i][j];
            //column sum
            for(int j = 0;j<N;j++) cSum += A[j][i];
            if(rSum != cSum) return 0;
        }
        return 1;
    }
}