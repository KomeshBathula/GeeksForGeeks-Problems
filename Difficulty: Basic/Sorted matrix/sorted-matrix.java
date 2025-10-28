// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        int res[] = new int[N*N];
        int idx = 0;
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++) 
                res[idx++] = Mat[i][j];
        }
        Arrays.sort(res);
        idx = 0;
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++)
                Mat[i][j] = res[idx++];
        }
        return Mat;
    }
};